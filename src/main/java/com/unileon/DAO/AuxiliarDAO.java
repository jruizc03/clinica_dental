package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Auxiliar;
import com.unileon.modelo.JPAUtil;

public class AuxiliarDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar auxiliar
	public void guardar(Auxiliar auxiliar) {
		entity.getTransaction().begin();
		entity.persist(auxiliar);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//editar auxiliar
	public void editar(Auxiliar administrador) {
		entity.getTransaction().begin();
		entity.merge(administrador);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//buscar auxiliar
	public Auxiliar buscar(int id) {
		Auxiliar a = new Auxiliar();
		a = entity.find(Auxiliar.class, id);
		JPAUtil.shutdown();
		return a;
	}
	
	//obtener todos los auxiliares
	public List<Auxiliar> obtenerAuxiliares(){
		List<Auxiliar> listaAuxiliares = new ArrayList<>();
		Query q = entity.createQuery("SELECT a FROM Auxiliar a");
		listaAuxiliares = q.getResultList();
		return listaAuxiliares;
	}
}