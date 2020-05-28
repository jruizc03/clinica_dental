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
public class Doctor{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDoctor;
	
	@Column
	private String nombreDoctor;
	
	@Column
	private String primerApellidoDoctor;
	
	@Column
	private String segundoApellidoDoctor;
	
	@Column
	private String emailDoctor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimientoDoctor;
	
	@Column
	private String doctorDNI;
	
	@Column
	private String especialidadDoctor;
	
	@Column
	private String password;

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getNombreDoctor() {
		return nombreDoctor;
	}

	public void setNombreDoctor(String nombre) {
		this.nombreDoctor = nombre;
	}

	public String getPrimerApellidoDoctor() {
		return primerApellidoDoctor;
	}

	public void setPrimerApellidoDoctor(String primerApellido) {
		this.primerApellidoDoctor = primerApellido;
	}

	public String getSegundoApellidoDoctor() {
		return segundoApellidoDoctor;
	}

	public void setSegundoApellidoDoctor(String segundoApellido) {
		this.segundoApellidoDoctor = segundoApellido;
	}

	public String getEmailDoctor() {
		return emailDoctor;
	}

	public void setEmailDoctor(String email) {
		this.emailDoctor = email;
	}

	public Date getFechaNacimientoDoctor() {
		return fechaNacimientoDoctor;
	}

	public void setFechaNacimientoDoctor(Date fechaNacimiento) {
		this.fechaNacimientoDoctor = fechaNacimiento;
	}

	public String getdoctorDNI() {
		return doctorDNI;
	}

	public void setdoctorDNI(String dNI) {
		this.doctorDNI = dNI;
	}

	public String getEspecialidadDoctor() {
		return especialidadDoctor;
	}

	public void setEspecialidadDoctor(String especialidad) {
		this.especialidadDoctor = especialidad;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
