package com.unileon.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.DAO.CitaDAO;
import com.unileon.modelo.Cita;

@ManagedBean(name="citaBean")
@RequestScoped
public class CitaBean {
	public List<Cita> obtenerCitas()
	{
		CitaDAO citaDAO = new CitaDAO();
		return citaDAO.obtenerCitas();
	}

}
