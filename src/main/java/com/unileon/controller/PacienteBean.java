package com.unileon.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.PacienteDAO;
import com.unileon.modelo.Paciente;

@ManagedBean(name = "pacienteBean")
@RequestScoped
public class PacienteBean {
	
	public String nuevo() {
		Paciente p = new Paciente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return  "/faces/nuevoPaciente.xhtml";
	}
	
	public String guardar (Paciente paciente) {		
		PacienteDAO pacienteDAO= new PacienteDAO();
		pacienteDAO.guardar(paciente);
		return  "/faces/tablaPacientes.xhtml";
	}

	public List<Paciente> obtenerPacientes() {
		PacienteDAO pacienteDAO = new PacienteDAO();

		return pacienteDAO.obtenerPacientes();
	}

	public String editar(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente p = new Paciente();
		p = pacienteDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(p);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return "/faces/editarPaciente.xhtml";
	}

	public String actualizar(Paciente paciente) {		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.editar(paciente);
		return "/faces/tablaPacientes.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.eliminar(id);
		System.out.println("Paciente eliminado..");
		return "/faces/tablaPacientes.xhtml";
	}

}
