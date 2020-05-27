package com.unileon.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idInstrumento;
	
	@Column
	private int existencias;
	
	@Column
	private String nombreInstrumento;

	public int getIdInstrumento() {
		return idInstrumento;
	}

	public void setIdInstrumento(int id) {
		this.idInstrumento = id;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}
}
