package com.unileon.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.AdministradorDAO;
import com.unileon.DAO.AuxiliarDAO;
import com.unileon.DAO.DoctorDAO;
import com.unileon.DAO.LoginDAO;
import com.unileon.modelo.Login;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable
{

	public String loginControl(Login login)
	{
		boolean success=false;
		if(login.getRol()=="administrador")
		{
			AdministradorDAO admDao = new AdministradorDAO();
			success=admDao.administradorLogin(login.getNombre(), login.getPassword());
			
			if(success==true)
				return "/faces/ventanaAdministrador.xhtml";
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("ERROR", "Usuario y/o contraseña erróneas"));
			return null;
		}
		else if(login.getRol()=="doctor")
		{
			DoctorDAO docDao = new DoctorDAO();
			success=docDao.loginDoctor(login.getNombre(), login.getPassword());
			
			if(success==true)
				return "/faces/ventanaDoctor.xhtml";
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("ERROR", "Usuario y/o contraseña erróneas"));
			return null;
		}
		else if(login.getRol()=="auxiliar")
		{
			AuxiliarDAO auxDao = new AuxiliarDAO();
			success=auxDao.auxiliarLogin(login.getNombre(), login.getPassword());
			
			if(success==true)
				return "/faces/ventanaAuxiliar.xhtml";
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("ERROR", "Usuario y/o contraseña erróneas"));
			return null;
		}
		else
		{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("ERROR", "Rol no seleccionado"));
			return null;
		}
	}
}
