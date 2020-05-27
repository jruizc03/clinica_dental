package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Paciente;
import com.unileon.modelo.JPAUtil;

public class PacienteDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Paciente paciente) {
		entity.getTransaction().begin();
		entity.persist(paciente);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Paciente paciente) {
		entity.getTransaction().begin();
		entity.merge(paciente);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Paciente buscar(int id) {
		Paciente p = new Paciente();
		p = entity.find(Paciente.class, id);
		//JPAUtil.shutdown();
		return p;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Paciente p = new Paciente();
		p = entity.find(Paciente.class, id);
		entity.getTransaction().begin();
		entity.remove(p);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Paciente> obtenerPacientes(){
		List<Paciente> listaPacientes = new ArrayList<>();
		Query q = entity.createQuery("SELECT p FROM Paciente p");
		listaPacientes = q.getResultList();
		return listaPacientes;
	}
}