package com.unileon.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.PacienteDAO;
import com.unileon.modelo.Doctor;
import com.unileon.modelo.Paciente;

@ManagedBean(name = "pacienteBean")
@RequestScoped
public class PacienteBean {
	
	private String nombre;
	private List<String> nombres;
	
	@PostConstruct
	public void init() {
		List<Paciente> pacientes = obtenerPacientes();
		String nombresPacientes[];
		nombresPacientes = new String[pacientes.size()];
		for(int i = 0; i < pacientes.size() ; i++) {
			Paciente temp = pacientes.get(i);
			nombresPacientes[i] = temp.getNombrePaciente();
		}
		nombres = Arrays.asList(nombresPacientes);
	}
	
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getNombres() {
		return nombres;
	}

	public void setNombres(List<String> nombres) {
		this.nombres = nombres;
	}

}
