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
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idDoctor")
	private int idDoctor;
	
	@Column(name="nombreDoctor")
	private String nombre;
	
	@Column(name="primerApellidoDoctor")
	private String primerApellido;
	
	@Column(name="segundoApellidoDoctor")
	private String segundoApellido;
	
	@Column(name="emailDoctor")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fechaNacimientoDoctor")
	private Date fechaNacimiento;
	
	@Column(name="doctorDNI")
	private String DNI;
	
	@Column(name="especialidadDoctor")
	private String especialidad;
	
	public Doctor() {
		
	}
	
	public Doctor(int id, String nombre, String primerApellido, String segundoApellido, String email, Date fechaNacimiento, String DNI, String especialidad) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		this.setEmail(email);
		this.setFechaNacimiento(fechaNacimiento);
		this.setDNI(DNI);
		this.setEspecialidad(especialidad);
	}

	public int getId() {
		return idDoctor;
	}

	public void setId(int idDoctor) {
		this.idDoctor = idDoctor;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
