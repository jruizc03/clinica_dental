package com.unileon.modelo;

public class Cita {
	private int id;
	private String fecha;
	
	public Cita() {
		
	}
	
	public Cita(int id, String fecha) {
		this.setId(id);
		this.setFecha(fecha);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
