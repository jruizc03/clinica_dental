package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Cita;
import com.unileon.modelo.JPAUtil;

public class CitaDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Cita cita) {
		entity.getTransaction().begin();
		entity.persist(cita);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Cita cita) {
		entity.getTransaction().begin();
		entity.merge(cita);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Cita buscar(int id) {
		Cita c = new Cita();
		c = entity.find(Cita.class, id);
		//JPAUtil.shutdown();
		return c;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Cita c = new Cita();
		c = entity.find(Cita.class, id);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Cita> obtenerCitas(){
		List<Cita> listaCitas = new ArrayList<>();
		Query q = entity.createQuery("SELECT c FROM Cita c");
		listaCitas = q.getResultList();
		return listaCitas;
	}
}