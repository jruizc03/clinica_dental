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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHistorial;
	
	@Column
	private String dolencia;
	
	@Column
	private String tratamiento;

	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int id) {
		this.idHistorial = id;
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
