package com.unileon.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="auxiliar")
public class Auxiliar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAuxiliar;
	
	@Column
	private String nombreAuxiliar;
	
	@Column
	private String primerApellidoAuxiliar;
	
	@Column
	private String segundoApellidoAuxiliar;
	
	@Column
	private String emailAuxiliar;

	@Column
	private String auxiliarDNI;
	
	@Column
	private String password;

	public int getIdAuxiliar() {
		return idAuxiliar;
	}

	public void setIdAuxiliar(int idAuxiliar) {
		this.idAuxiliar = idAuxiliar;
	}

	public String getNombreAuxiliar() {
		return nombreAuxiliar;
	}

	public void setNombreAuxiliar(String nombre) {
		this.nombreAuxiliar = nombre;
	}

	public String getPrimerApellidoAuxiliar() {
		return primerApellidoAuxiliar;
	}

	public void setPrimerApellidoAuxiliar(String primerApellido) {
		this.primerApellidoAuxiliar = primerApellido;
	}

	public String getSegundoApellidoAuxiliar() {
		return segundoApellidoAuxiliar;
	}

	public void setSegundoApellidoAuxiliar(String segundoApellido) {
		this.segundoApellidoAuxiliar = segundoApellido;
	}

	public String getEmailAuxiliar() {
		return emailAuxiliar;
	}

	public void setEmailAuxiliar(String email) {
		this.emailAuxiliar = email;
	}

	public String getAuxiliarDNI() {
		return auxiliarDNI;
	}

	public void setAuxiliarDNI(String DNI) {
		this.auxiliarDNI = DNI;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
