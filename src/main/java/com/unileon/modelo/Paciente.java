package com.unileon.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPaciente;
	
	@Column
	private String nombrePaciente;
	
	@Column
	private String primerApellidoPaciente;
	
	@Column
	private String segundoApellidoPaciente;
	
	@Column
	private String emailPaciente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimientoPaciente;
	
	@Column
	private String pacienteDNI;
	
	@Column
	private String direccionPaciente;
	
	@ManyToOne
	@JoinColumn(name = "fk_idHistorial")
	private Historial historial;
	
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int id) {
		this.idPaciente = id;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombre) {
		this.nombrePaciente = nombre;
	}

	public String getPrimerApellidoPaciente() {
		return primerApellidoPaciente;
	}

	public void setPrimerApellidoPaciente(String primerApellido) {
		this.primerApellidoPaciente = primerApellido;
	}

	public String getSegundoApellidoPaciente() {
		return segundoApellidoPaciente;
	}

	public void setSegundoApellidoPaciente(String segundoApellido) {
		this.segundoApellidoPaciente = segundoApellido;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String email) {
		this.emailPaciente = email;
	}

	public Date getFechaNacimientoPaciente() {
		return fechaNacimientoPaciente;
	}

	public void setFechaNacimientoPaciente(Date fechaNacimiento) {
		this.fechaNacimientoPaciente = fechaNacimiento;
	}

	public String getPacienteDNI() {
		return pacienteDNI;
	}

	public void setPacienteDNI(String DNI) {
		pacienteDNI = DNI;
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccion) {
		this.direccionPaciente = direccion;
	}

	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
}
