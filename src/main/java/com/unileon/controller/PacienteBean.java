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
	
	public String nuevoDesdeAdmin() {
		Paciente p = new Paciente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return  "/faces/nuevoPacienteAdmin.xhtml";
	}
	
	public String nuevoDesdeDoctor() {
		Paciente p = new Paciente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return  "/faces/nuevoPacienteDoctor.xhtml";
	}
	
	public String guardarDesdeAdmin(Paciente paciente) {		
		PacienteDAO pacienteDAO= new PacienteDAO();
		pacienteDAO.guardar(paciente);
		return  "/faces/tablaPacientesAdmin.xhtml";
	}
	
	public String guardarDesdeDoctor(Paciente paciente) {		
		PacienteDAO pacienteDAO= new PacienteDAO();
		pacienteDAO.guardar(paciente);
		return  "/faces/tablaPacientesDoctor.xhtml";
	}

	public List<Paciente> obtenerPacientes() {
		PacienteDAO pacienteDAO = new PacienteDAO();

		return pacienteDAO.obtenerPacientes();
	}

	public String editarDesdeAdmin(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente p = new Paciente();
		p = pacienteDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(p);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return "/faces/editarPacienteAdmin.xhtml";
	}
	
	public String editarDesdeDoctor(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente p = new Paciente();
		p = pacienteDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(p);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return "/faces/editarPacienteDoctor.xhtml";
	}

	public String editarAux(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente p = new Paciente();
		p = pacienteDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(p);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("paciente", p);
		return "/faces/editarPacienteAux.xhtml";
	}
	
	public String actualizarDesdeAdmin(Paciente paciente) {		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.editar(paciente);
		return "/faces/tablaPacientesAdmin.xhtml";
	}
	
	public String actualizarDesdeDoctor(Paciente paciente) {		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.editar(paciente);
		return "/faces/tablaPacientesDoctor.xhtml";
	}
	
	public String actualizarAux(Paciente paciente) {		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.editar(paciente);
		return "/faces/tablaPacientesSoloEditar.xhtml";
	}

	public String eliminarDesdeAdmin(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.eliminar(id);
		System.out.println("Paciente eliminado..");
		return "/faces/tablaPacientesAdmin.xhtml";
	}
	
	public String eliminarDesdeDoctor(int id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.eliminar(id);
		System.out.println("Paciente eliminado..");
		return "/faces/tablaPacientesDoctor.xhtml";
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
