package com.unileon.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.unileon.DAO.HistorialDAO;
import com.unileon.modelo.Historial;

@ManagedBean(name = "historialBean")
@RequestScoped
public class HistorialBean {
	
	private String tratamiento;
	private List<String> tratamientos;
	
	@PostConstruct
	public void init() {
		List<Historial> historiales = obtenerHistoriales();
		String tratamientosHistoriales[];
		tratamientosHistoriales = new String[historiales.size()];
		for(int i = 0; i < historiales.size() ; i++) {
			Historial temp = historiales.get(i);
			tratamientosHistoriales[i] = temp.getTratamiento();
		}
		tratamientos = Arrays.asList(tratamientosHistoriales);
	}

	public List<Historial> obtenerHistoriales() {
		HistorialDAO historialDAO = new HistorialDAO();

		return historialDAO.obtenerHistoriales();
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public List<String> getTratamientos() {
		return tratamientos;
	}

	public void setNombres(List<String> tratamientos) {
		this.tratamientos = tratamientos;
	}

}
