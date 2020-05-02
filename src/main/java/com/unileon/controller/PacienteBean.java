package com.unileon.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.DAO.PacienteDAO;
import com.unileon.modelo.Paciente;

@ManagedBean(name="pacienteBean")
@RequestScoped
public class PacienteBean {
	public List<Paciente> obtenerPacientes()
	{
		PacienteDAO pacDAO = new PacienteDAO();
		return pacDAO.obtenerPacientes();
	}
}