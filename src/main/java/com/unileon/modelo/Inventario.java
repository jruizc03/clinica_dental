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
	private int id;
	
	@Column
	private int existencias;
	
	@Column
	private String nombreInstrumento;
	
	public Inventario() {
		
	}
	
	public Inventario(int id, int existencias, String nombreInstrumento) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
