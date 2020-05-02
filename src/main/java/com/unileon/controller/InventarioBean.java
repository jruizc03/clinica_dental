package com.unileon.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.DAO.InventarioDAO;
import com.unileon.modelo.Inventario;

@ManagedBean(name="inventarioBean")
@RequestScoped
public class InventarioBean {
	public List<Inventario> obtenerInventario()
	{
		InventarioDAO invDAO = new InventarioDAO();
		return invDAO.obtenerHerramienta();
	}

}
