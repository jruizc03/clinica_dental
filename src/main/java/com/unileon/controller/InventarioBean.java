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
	
	public String nuevo() {
		Inventario i = new Inventario();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return  "/faces/nuevoInstrumento.xhtml";
	}
	
	public String guardar (Inventario inventario) {		
		InventarioDAO inventarioDAO= new InventarioDAO();
		inventarioDAO.guardar(inventario);
		return  "/faces/tablaInventario.xhtml";
	}

	public List<Inventario> obtenerInventario() {
		InventarioDAO inventarioDAO = new InventarioDAO();

		return inventarioDAO.obtenerInventario();
	}

	public String editar(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		Inventario i = new Inventario();
		i = inventarioDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(i);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("inventario", i);
		return "/faces/editarInstrumento.xhtml";
	}

	public String actualizar(Inventario doctor) {		
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.editar(doctor);
		return "/faces/tablaInventario.xhtml";
	}

	// eliminar un cliente
	public String eliminar(int id) {
		InventarioDAO inventarioDAO = new InventarioDAO();
		inventarioDAO.eliminar(id);
		System.out.println("Instrumento eliminado..");
		return "/faces/tablaInventario.xhtml";
	}

}
