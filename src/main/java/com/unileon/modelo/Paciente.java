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
@Table(name="paciente")
public class Paciente {
	
	@Id
	@Column(name="idPaciente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombrePaciente")
	private String nombre;
	
	@Column(name="primerApellidoPaciente")
	private String primerApellido;
	
	@Column(name="segundoApellidoPaciente")
	private String segundoApellido;
	
	@Column(name="emailPaciente")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fechaNacimientoPaciente")
	private Date fechaNacimiento;
	
	@Column(name="pacienteDNI")
	private String DNI;
	
	@Column(name="direccionPaciente")
	private String direccion;
	
	public Paciente() {
		
	}
	
	public Paciente(int id, String nombre, String primerApellido, String segundoApellido, String email, Date fechaNacimiento, String DNI, String direccion) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		this.setEmail(email);
		this.setFechaNacimiento(fechaNacimiento);
		this.setDNI(DNI);
		this.setDireccion(direccion);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
