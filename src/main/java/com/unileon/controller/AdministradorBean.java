package com.unileon.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.unileon.modelo.Administrador;

@ManagedBean(name="administradorBean")
@RequestScoped
public class AdministradorBean {
	
	public List<Administrador> obtenerAdmins(){
		List<Administrador> listaAdmins = new ArrayList<>();
		
		Administrador a1 = new Administrador();
		Administrador a2 = new Administrador();
		a1.setId(1);
		a1.setNombre("Adrián");
		a1.setPrimerApellido("Prieto");
		a1.setSegundoApellido("González");
		a1.setEmail("aprieg04");
		Date fecha1 = new Date(1998, 12, 13);
		a1.setFechaNacimiento(fecha1);
		a1.setDNI("71798425I");
		
		a2.setId(2);
		a2.setNombre("Julio César");
		a2.setPrimerApellido("Ruiz");
		a2.setSegundoApellido("Calle");
		a2.setEmail("jruizc03");
		Date fecha2 = new Date(1998, 1, 19);
		a2.setFechaNacimiento(fecha2);
		a2.setDNI("71746035L");
		
		return listaAdmins; 
	}
}
