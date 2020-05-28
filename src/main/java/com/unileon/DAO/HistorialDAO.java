package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Historial;
import com.unileon.modelo.JPAUtil;

public class HistorialDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Historial historial) {
		entity.getTransaction().begin();
		entity.persist(historial);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Historial historial) {
		entity.getTransaction().begin();
		entity.merge(historial);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Historial buscar(int id) {
		Historial h = new Historial();
		h = entity.find(Historial.class, id);
		//JPAUtil.shutdown();
		return h;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Historial h = new Historial();
		h = entity.find(Historial.class, id);
		entity.getTransaction().begin();
		entity.remove(h);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Historial> obtenerHistoriales(){
		List<Historial> listaHistoriales = new ArrayList<>();
		Query q = entity.createQuery("SELECT h FROM Historial h");
		listaHistoriales = q.getResultList();
		return listaHistoriales;
	}
}