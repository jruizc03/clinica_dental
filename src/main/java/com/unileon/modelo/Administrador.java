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
@Table(name="administrador")
public class Administrador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdmin;
	
	@Column(name="nombreAdmin")
	private String nombre;
	
	@Column(name="primerApellidoAdmin")
	private String primerApellido;
	
	@Column(name="segundoApellidoAdmin")
	private String segundoApellido;
	
	@Column(name="emailAdmin")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fechaNacimientoAdmin")
	private Date fechaNacimiento;
	
	@Column(name="AdminDNI")
	private String DNI;
	
	public Administrador() {
		
	}
	
	public Administrador(int id, String nombre, String primerApellido, String segundoApellido, String email, Date fechaNacimiento, String DNI) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		this.setEmail(email);
		this.setFechaNacimiento(fechaNacimiento);
		this.setDNI(DNI);
	}

	public int getId() {
		return idAdmin;
	}

	public void setId(int idAdmin) {
		this.idAdmin = idAdmin;
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
