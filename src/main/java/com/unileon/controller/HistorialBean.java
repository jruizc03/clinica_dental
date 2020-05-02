package com.unileon.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.DAO.HistorialDAO;
import com.unileon.modelo.Historial;

@ManagedBean(name="historialBean")
@RequestScoped
public class HistorialBean {
	public List<Historial> obtenerCitas()
	{
		HistorialDAO histDAO = new HistorialDAO();
		return histDAO.obtenerHistoriales();
	}

}
