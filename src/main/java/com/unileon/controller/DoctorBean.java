package com.unileon.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import com.unileon.DAO.DoctorDAO;
import com.unileon.modelo.Doctor;

@ManagedBean(name="doctorBean")
@SessionScoped
public class DoctorBean{

	private List<Doctor> listaDoctores = new ArrayList<Doctor>();
	
	public void setListaDoctores(List<Doctor> lista) {
		this.listaDoctores = lista;
	}
	
	public List<Doctor> getListaDoctores(){
		DoctorDAO doctorDAO = new DoctorDAO(); 
		return doctorDAO.obtenerDoctores();
	}
	
	public String editar(int id) {
		DoctorDAO doctorDAO = new DoctorDAO(); 
		Doctor d = new Doctor();
		d = doctorDAO.buscar(id);
		//System.out.println(d);
		
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("doctor", d);
		return "/faces/editarDoctor.xhtml";
	}
	
	
	public String actualizar(Doctor doctor) {
		DoctorDAO doctorDAO = new DoctorDAO(); 
		doctorDAO.editar(doctor);
		return "/faces/index.xhtml";
	}
	
	public String eliminar(int id) {
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.eliminar(id);
		System.out.println("Doctor eliminado");
		return "/faces/index.xhtml";
	}
	
	public String nuevo() {
		Doctor d = new Doctor();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("doctor", d);
		return "/faces/nuevoDoctor.xhtml";
	}
	
	public String guardar(Doctor doctor) {
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.guardar(doctor);
		return "/faces/index.xhtml";
	}
}
