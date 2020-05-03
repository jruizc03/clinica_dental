package com.unileon.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historial")
public class Historial {
	
	@Id
	@Column(name="idHistorial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="dolencia")
	private String dolencia;
	
	@Column(name="tratamiento")
	private String tratamiento;
	
	public Historial() {
		
	}
	
	public Historial(int id, String dolencia, String tratamiento) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDolencia() {
		return dolencia;
	}

	public void setDolencia(String dolencia) {
		this.dolencia = dolencia;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
}
