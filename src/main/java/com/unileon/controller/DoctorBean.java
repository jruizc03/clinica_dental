package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.modelo.Doctor;

@ManagedBean(name="doctorBean")
@RequestScoped
public class DoctorBean {
	
	public List<Doctor> obtenerDoctores(){
		List<Doctor> listaDoctores = new ArrayList<>();
		
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		d1.setId(1);
		d1.setNombre("Adrián");
		d1.setPrimerApellido("Prieto");
		d1.setSegundoApellido("González");
		d1.setEmail("aprieg04");
		Date fecha1 = new Date(1998, 12, 13);
		d1.setFechaNacimiento(fecha1);
		d1.setDNI("71798425I");
		d1.setEspecialidad("Ortodoncias");
		
		d2.setId(2);
		d2.setNombre("Julio César");
		d2.setPrimerApellido("Ruiz");
		d2.setSegundoApellido("Calle");
		d2.setEmail("jruizc03");
		Date fecha2 = new Date(1998, 1, 19);
		d2.setFechaNacimiento(fecha2);
		d2.setDNI("71746035L");
		d2.setEspecialidad("Empastes");
		
		listaDoctores.add(d1);
		listaDoctores.add(d2);
		
		return listaDoctores; 
	}
}
