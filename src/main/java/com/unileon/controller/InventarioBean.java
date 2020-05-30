package com.unileon.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.InventarioDAO;
import com.unileon.modelo.Inventario;

@ManagedBean(name = "inventarioBean")
@RequestScoped
public class InventarioBean {
	
	public String nuevoDesdeAdmin() {
		Inventario i = new Inventario();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return  "/faces/nuevoInstrumento.xhtml";
	}
	
	public String nuevoDesdeAux() {
		Inventario i = new Inventario();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return  "/faces/nuevoInstrumentoAux.xhtml";
	}
	
	public String guardarDesdeAdmin (Inventario inventario) {		
		InventarioDAO inventarioDAO= new InventarioDAO();
		inventarioDAO.guardar(inventario);
		return  "/faces/tablaInventarioAdmin.xhtml";
	}
	
	public String guardarDesdeAux (Inventario inventario) {		
		InventarioDAO inventarioDAO= new InventarioDAO();
		inventarioDAO.guardar(inventario);
		return  "/faces/tablaInventarioAux.xhtml";
	}

	public List<Inventario> obtenerInventario() {
		InventarioDAO inventarioDAO = new InventarioDAO();

		return inventarioDAO.obtenerInventario();
	}

	public String editarDesdeAdmin(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		Inventario i = new Inventario();
		i = inventarioDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(i);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return "/faces/editarInstrumentoAdmin.xhtml";
	}
	
	public String editarDesdeAux(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		Inventario i = new Inventario();
		i = inventarioDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(i);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return "/faces/editarInstrumentoAux.xhtml";
	}

	public String actualizarDesdeAdmin(Inventario doctor) {		
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.editar(doctor);
		return "/faces/tablaInventarioAdmin.xhtml";
	}
	
	public String actualizarDesdeAux(Inventario doctor) {		
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.editar(doctor);
		return "/faces/tablaInventarioAux.xhtml";
	}

	public String eliminarDesdeAdmin(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.eliminar(id);
		System.out.println("Instrumento eliminado..");
		return "/faces/tablaInventarioAdmin.xhtml";
	}
	
	public String eliminarDesdeAux(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.eliminar(id);
		System.out.println("Instrumento eliminado..");
		return "/faces/tablaInventarioAux.xhtml";
	}

}
