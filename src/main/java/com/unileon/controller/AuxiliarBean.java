package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.AuxiliarDAO;
import com.unileon.modelo.Auxiliar;

@ManagedBean(name = "auxiliarBean")
@RequestScoped
public class AuxiliarBean {
	
	public String nuevo() {
		Auxiliar a = new Auxiliar();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", a);
		return  "/faces/nuevoAuxiliar.xhtml";
	}
	
	public String guardar (Auxiliar auxiliar) {		
		AuxiliarDAO auxiliarDAO= new AuxiliarDAO();
		auxiliarDAO.guardar(auxiliar);
		return  "/faces/tablaAuxiliares.xhtml";
	}

	public List<Auxiliar> obtenerAuxiliares() {
		AuxiliarDAO auxiliarDAO = new AuxiliarDAO();

		return auxiliarDAO.obtenerAuxiliares();
	}

	public String editar(int id) {
		AuxiliarDAO auxiliarDAO = new AuxiliarDAO();
		Auxiliar a = new Auxiliar();
		a = auxiliarDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(a);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("auxiliar", a);
		return "/faces/editarAuxiliar.xhtml";
	}

	public String actualizar(Auxiliar auxiliar) {		
		AuxiliarDAO auxiliarDAO = new AuxiliarDAO();
		auxiliarDAO.editar(auxiliar);
		return "/faces/tablaAuxiliares.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		AuxiliarDAO auxiliarDAO = new AuxiliarDAO();
		auxiliarDAO.eliminar(id);
		System.out.println("Auxiliar eliminado..");
		return "/faces/tablaAuxiliares.xhtml";
	}
	
	public String mostrarInventario() {
		return "/faces/tablaInventario.xhtml";
	}
	
	public String mostrarPacientes() {
		return "/faces/tablaPacientesSoloEditar.xhtml";
	}
	
	public String mostrarCitas() {
		return "/faces/tablaCitasAux.xhtml";
	}
	
	public String volverPrincipal()
	{
		return "/faces/ventanaAuxiliar.xhtml";
	}
	
	public String cerrarSesion()
	{
		return "/faces/login.xhtml";
	}

}
