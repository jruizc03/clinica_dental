package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.transaction.Transactional;

import com.unileon.DAO.CitaDAO;
import com.unileon.modelo.Cita;

@ManagedBean(name = "citaBean")
@RequestScoped
public class CitaBean {
	
	public String nuevoDesdeAdmin() {
		Cita c = new Cita();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", c);
		return  "/faces/nuevaCitaAdmin.xhtml";
	}
	
	public String nuevoDesdeDoctor() {
		Cita c = new Cita();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", c);
		return  "/faces/nuevaCitaDoctor.xhtml";
	}
	
	public String nuevoDesdeAux() {
		Cita c = new Cita();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", c);
		return  "/faces/nuevaCitaAux.xhtml";
	}
	
	public String guardarDesdeAdmin(Cita cita) {		
		CitaDAO citaDAO= new CitaDAO();
		citaDAO.guardar(cita);
		return  "/faces/tablaCitasAdmin.xhtml";
	}
	
	public String guardarDesdeDoctor(Cita cita) {		
		CitaDAO citaDAO= new CitaDAO();
		citaDAO.guardar(cita);
		return  "/faces/tablaCitasDoctor.xhtml";
	}
	
	public String guardarDesdeAux(Cita cita) {		
		CitaDAO citaDAO= new CitaDAO();
		citaDAO.guardar(cita);
		return  "/faces/tablaCitasAux.xhtml";
	}

	public List<Cita> obtenerCitas() {
		CitaDAO citaDAO = new CitaDAO();

		return citaDAO.obtenerCitas();
	}

	public String editarDesdeAdmin(int id) {
		CitaDAO citaDAO = new CitaDAO();
		Cita c = new Cita();
		c = citaDAO.buscar(id);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cita", c);
		return "/faces/editarCitaAdmin.xhtml";
	}
	
	public String editarDesdeDoctor(int id) {
		CitaDAO citaDAO = new CitaDAO();
		Cita c = new Cita();
		c = citaDAO.buscar(id);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cita", c);
		return "/faces/editarCitaDoctor.xhtml";
	}
	
	public String editarDesdeAux(int id) {
		CitaDAO citaDAO = new CitaDAO();
		Cita c = new Cita();
		c = citaDAO.buscar(id);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cita", c);
		return "/faces/editarCitaAux.xhtml";
	}

	public String actualizarDesdeAdmin(Cita cita) {		
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.editar(cita);
		return "/faces/tablaCitasAdmin.xhtml";
	}
	
	public String actualizarDesdeDoctor(Cita cita) {		
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.editar(cita);
		return "/faces/tablaCitasDoctor.xhtml";
	}
	
	public String actualizarDesdeAux(Cita cita) {		
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.editar(cita);
		return "/faces/tablaCitasAux.xhtml";
	}

	public String eliminarDesdeAdmin(int id) {
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.eliminar(id);
		return "/faces/tablaCitasAdmin.xhtml";
	}
	
	public String eliminarDesdeDoctor(int id) {
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.eliminar(id);
		return "/faces/tablaCitasDoctor.xhtml";
	}
	
	public String eliminarDesdeAux(int id) {
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.eliminar(id);
		return "/faces/tablaCitasAux.xhtml";
	}
}
