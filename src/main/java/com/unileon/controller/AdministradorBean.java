package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.AdministradorDAO;
import com.unileon.modelo.Administrador;

@ManagedBean(name = "administradorBean")
@RequestScoped
public class AdministradorBean {
	
	public String nuevo() {
		Administrador a = new Administrador();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("administrador", a);
		return  "/faces/nuevoAdministrador.xhtml";
	}
		
	public String guardar (Administrador administrador) {		
		AdministradorDAO adminDAO= new AdministradorDAO();
		adminDAO.guardar(administrador);
		return  "/faces/index.xhtml";
	}

	public List<Administrador> obtenerAdministradores() {
		AdministradorDAO adminDAO = new AdministradorDAO();

		return adminDAO.obtenerAdministradores();
	}

	public String editar(int id) {
		AdministradorDAO adminDAO = new AdministradorDAO();
		Administrador a = new Administrador();
		a = adminDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(a);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("administrador", a);
		return "/faces/editarAdministrador.xhtml";
	}

	public String actualizar(Administrador admin) {		
		AdministradorDAO adminDAO = new AdministradorDAO();
		adminDAO.editar(admin);
		return "/faces/index.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		AdministradorDAO adminDAO = new AdministradorDAO();
		adminDAO.eliminar(id);
		System.out.println("Administrador eliminado..");
		return "/faces/index.xhtml";
	}
	
	public String mostrarDoctores() {
		return "/faces/tablaDoctores.xhtml";
	}
	
	public String mostrarAuxiliares() {
		return "/faces/tablaAuxiliares.xhtml";
	}
	
	public String mostrarPacientes() {
		return "/faces/tablaPacientes.xhtml";
	}
	
	public String mostrarInventario() {
		return "/faces/tablaInventario.xhtml";
	}
	
	public String mostrarCitas() {
		return "/faces/tablaCitas.xhtml";
	}

	public String volverPrincipal()
	{
		return "/faces/ventanaAdministrador.xhtml";
	}
	
	public String cerrarSesion()
	{
		return "/faces/login.xhtml";
	}
}
