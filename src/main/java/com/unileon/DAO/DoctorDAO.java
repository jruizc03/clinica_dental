package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Administrador;
import com.unileon.modelo.Doctor;
import com.unileon.modelo.JPAUtil;

public class DoctorDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Doctor doctor) {
		entity.getTransaction().begin();
		entity.persist(doctor);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Doctor doctor) {
		entity.getTransaction().begin();
		entity.merge(doctor);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Doctor buscar(int id) {
		Doctor a = new Doctor();
		a = entity.find(Doctor.class, id);
		//JPAUtil.shutdown();
		return a;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Doctor d = new Doctor();
		d = entity.find(Doctor.class, id);
		entity.getTransaction().begin();
		entity.remove(d);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Doctor> obtenerDoctores(){
		List<Doctor> listaDoctores = new ArrayList<>();
		Query q = entity.createQuery("SELECT d FROM Doctor d");
		listaDoctores = q.getResultList();
		return listaDoctores;
	}
	
	public Doctor doctorLogin(String nombre)
	{
		Query q = entity.createQuery("SELECT d FROM Doctor d WHERE d.doctorDNI = :nombre");
		q.setParameter("nombre", nombre);
		List<Doctor> lista = q.getResultList();
		if(!lista.isEmpty())
			return lista.get(0);
		return null;
	}
}