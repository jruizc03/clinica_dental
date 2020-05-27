package com.unileon.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.DoctorDAO;
import com.unileon.modelo.Doctor;

@ManagedBean(name = "doctorBean")
@RequestScoped
public class DoctorBean {
	
	public String nuevo() {
		Doctor d = new Doctor();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("doctor", d);
		return  "/faces/nuevoDoctor.xhtml";
	}
	
	//Estos 3 metodos son para probar las ventanas. No deben estar aqui despues.
	public String ventanaAdmin() {
		return "/faces/ventanaAdministrador.xhtml";
	}
	
	public String ventanaDoctor() {
		return "/faces/ventanaDoctor.xhtml";
	}
	
	public String ventanaAuxiliar() {
		return "/faces/ventanaAuxiliar.xhtml";
	}
	
	public String guardar (Doctor doctor) {		
		DoctorDAO doctorDAO= new DoctorDAO();
		doctorDAO.guardar(doctor);
		return  "/faces/tablaDoctores.xhtml";
	}

	public List<Doctor> obtenerDoctores() {
		DoctorDAO doctorDAO = new DoctorDAO();

		return doctorDAO.obtenerDoctores();
	}

	public String editar(int id) {
		DoctorDAO doctorDAO = new DoctorDAO();
		Doctor d = new Doctor();
		d = doctorDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(d);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("doctor", d);
		return "/faces/editarDoctor.xhtml";
	}

	public String actualizar(Doctor doctor) {		
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.editar(doctor);
		return "/faces/tablaDoctores.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.eliminar(id);
		System.out.println("Doctor eliminado..");
		return "/faces/tablaDoctores.xhtml";
	}
	
	public String mostrarPacientes() {
		return "/faces/tablaPacientes.xhtml";
	}

}
