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
	
	@Column
	private String nombreAdmin;
	
	@Column
	private String primerApellidoAdmin;
	
	@Column
	private String segundoApellidoAdmin;
	
	@Column
	private String emailAdmin;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimientoAdmin;
	
	@Column
	private String adminDNI;
	
	@Column
	private String password;

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNombreAdmin() {
		return nombreAdmin;
	}

	public void setNombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
	}

	public String getPrimerApellidoAdmin() {
		return primerApellidoAdmin;
	}

	public void setPrimerApellidoAdmin(String primerApellidoAdmin) {
		this.primerApellidoAdmin = primerApellidoAdmin;
	}

	public String getSegundoApellidoAdmin() {
		return segundoApellidoAdmin;
	}

	public void setSegundoApellidoAdmin(String segundoApellidoAdmin) {
		this.segundoApellidoAdmin = segundoApellidoAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}

	public Date getFechaNacimientoAdmin() {
		return fechaNacimientoAdmin;
	}

	public void setFechaNacimientoAdmin(Date fechaNacimientoAdmin) {
		this.fechaNacimientoAdmin = fechaNacimientoAdmin;
	}

	public String getAdminDNI() {
		return adminDNI;
	}

	public void setAdminDNI(String adminDNI) {
		this.adminDNI = adminDNI;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
