package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
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
		return  "/faces/index.xhtml";
	}

	public List<Doctor> obtenerDoctores() {
		DoctorDAO clienteDAO = new DoctorDAO();

		/*
		 * List<Cliente> listaClientes = new ArrayList<>(); Cliente c1 = new Cliente();
		 * c1.setId(1L); c1.setNombres("Elivar"); c1.setApellidos("Largo");
		 * c1.setDireccion("Loja");
		 * 
		 * Cliente c2 = new Cliente(); c2.setId(1L); c2.setNombres("Elivar1");
		 * c2.setApellidos("Largo1"); c2.setDireccion("Loja1"); listaClientes.add(c1);
		 * listaClientes.add(c2);
		 * 
		 * return listaClientes;
		 */
		return clienteDAO.obtenerDoctores();
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
		return "/faces/index.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.eliminar(id);
		System.out.println("Doctor eliminado..");
		return "/faces/index.xhtml";
	}

}
