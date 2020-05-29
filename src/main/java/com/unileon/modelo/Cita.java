package com.unileon.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.unileon.modelo.Doctor;

@Entity
@Table(name="cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCita;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCita;
	
	@ManyToOne
	@JoinColumn(name = "fk_idDoctor")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "fk_idPaciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "fk_idHistorial")
	private Historial historial;

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int id) {
		this.idCita = id;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fecha) {
		this.fechaCita = fecha;
	}
	
	public Doctor getDoctor() {
		return this.doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Historial getHistorial() {
		return this.historial;
	}
	
	public void setHistorial(Historial historial) {
		this.historial  = historial;
	}
}
