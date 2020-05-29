package com.unileon.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.AdministradorDAO;
import com.unileon.DAO.AuxiliarDAO;
import com.unileon.DAO.DoctorDAO;
import com.unileon.modelo.Administrador;
import com.unileon.modelo.Auxiliar;
import com.unileon.modelo.Doctor;
import com.unileon.modelo.Login;

@ManagedBean(name = "loginBean")
@RequestScoped


public class LoginBean implements Serializable
{
	@EJB
	private Administrador adminAutenticado;
	@EJB
	private Doctor doctorAutenticado;
	@EJB
	private Auxiliar auxiliarAutenticado;
	
	private AdministradorDAO adminAutenticadoDAO = new AdministradorDAO();
	private DoctorDAO doctorAutenticadoDAO = new DoctorDAO();
	private AuxiliarDAO auxiliarAutenticadoDAO = new AuxiliarDAO();
	
	private String nombre;

	private String password;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Administrador getAdminAutenticado() {
		return adminAutenticado;
	}
	public void setAdminAutenticado(Administrador adminAutenticado) {
		this.adminAutenticado=adminAutenticado;
	}
	
	public Doctor getDoctorAutenticado() {
		return doctorAutenticado;
	}
	public void setDoctorAutenticado(Doctor doctorAutenticado) {
		this.doctorAutenticado=doctorAutenticado;
	}
	
	public Auxiliar getAuxiliarAutenticado() {
		return auxiliarAutenticado;
	}
	public void setAuxiliarAutenticado(Auxiliar auxiliarAutenticado) {
		this.auxiliarAutenticado=auxiliarAutenticado;
	}
	
	public String loginControl()
	{

		
		adminAutenticado=adminAutenticadoDAO.adminLogin(nombre);
		if(adminAutenticado!=null)
		{
			if(adminAutenticado.getPassword().equals(password))
				return "/faces/ventanaAdministrador.xhtml";
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Password incorrecta para el admin", "Password incorrecta para el admin"));
		}
		
		doctorAutenticado=doctorAutenticadoDAO.doctorLogin(nombre);
		if(doctorAutenticado!=null)
		{
			if(doctorAutenticado.getPassword().equals(password))
				return "/faces/ventanaDoctor.xhtml";
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Password incorrecta para el doctor", "Password incorrecta para el doctor"));
		}
		
		auxiliarAutenticado=auxiliarAutenticadoDAO.auxiliarLogin(nombre);
		if(auxiliarAutenticado!=null)
		{
			if(auxiliarAutenticado.getPassword().equals(password))
				return "/faces/ventanaAuxiliar.xhtml";
			FacesContext.getCurrentInstance().addMessage("Password", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Password incorrecta para el auxiliar", "Password incorrecta para el auxiliar"));
		}
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "El usuario no existe", "El usuario no exite"));
		return null;
	}
	

}
