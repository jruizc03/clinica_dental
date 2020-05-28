package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.CitaDAO;
import com.unileon.modelo.Cita;

@ManagedBean(name = "citaBean")
@RequestScoped
public class CitaBean {
	
	public String nuevo() {
		Cita c = new Cita();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", c);
		return  "/faces/nuevaCita.xhtml";
	}
	
	public String guardar (Cita cita) {		
		CitaDAO citaDAO= new CitaDAO();
		citaDAO.guardar(cita);
		return  "/faces/tablaCitas.xhtml";
	}

	public List<Cita> obtenerCitas() {
		CitaDAO citaDAO = new CitaDAO();

		return citaDAO.obtenerCitas();
	}

	public String editar(int id) {
		CitaDAO citaDAO = new CitaDAO();
		Cita c = new Cita();
		c = citaDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(c);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cita", c);
		return "/faces/editarCita.xhtml";
	}

	public String actualizar(Cita cita) {		
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.editar(cita);
		return "/faces/tablaCitas.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		CitaDAO citaDAO = new CitaDAO();
		citaDAO.eliminar(id);
		System.out.println("Auxiliar eliminado..");
		return "/faces/tablaCitas.xhtml";
	}
}
