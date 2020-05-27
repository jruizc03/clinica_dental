package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Auxiliar;
import com.unileon.modelo.JPAUtil;

public class AuxiliarDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Auxiliar auxiliar) {
		entity.getTransaction().begin();
		entity.persist(auxiliar);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Auxiliar auxiliar) {
		entity.getTransaction().begin();
		entity.merge(auxiliar);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Auxiliar buscar(int id) {
		Auxiliar a = new Auxiliar();
		a = entity.find(Auxiliar.class, id);
		//JPAUtil.shutdown();
		return a;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Auxiliar a = new Auxiliar();
		a = entity.find(Auxiliar.class, id);
		entity.getTransaction().begin();
		entity.remove(a);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Auxiliar> obtenerAuxiliares(){
		List<Auxiliar> listaAuxiliares = new ArrayList<>();
		Query q = entity.createQuery("SELECT a FROM Auxiliar a");
		listaAuxiliares = q.getResultList();
		return listaAuxiliares;
	}
}