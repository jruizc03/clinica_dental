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
	
	@Column(name="nombreAuxiliar")
	private String nombre;
	
	@Column(name="primerApellidoAuxiliar")
	private String primerApellido;
	
	@Column(name="segundoApellidoAuxiliar")
	private String segundoApellido;
	
	@Column(name="emailAuxiliar")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fechaNacimientoAuxiliar")
	private Date fechaNacimiento;
	
	@Column(name="AuxiliarDNI")
	private String DNI;
	
	public Auxiliar() {
		
	}
	
	public Auxiliar(int id, String nombre, String primerApellido, String segundoApellido, String email, Date fechaNacimiento, String DNI) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		this.setEmail(email);
		this.setFechaNacimiento(fechaNacimiento);
		this.setDNI(DNI);
	}

	public int getId() {
		return idAuxiliar;
	}

	public void setId(int idAuxiliar) {
		this.idAuxiliar = idAuxiliar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
}
