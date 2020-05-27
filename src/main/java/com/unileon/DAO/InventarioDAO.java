package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Inventario;
import com.unileon.modelo.JPAUtil;

public class InventarioDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Inventario inventario) {
		entity.getTransaction().begin();
		entity.persist(inventario);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Inventario inventario) {
		entity.getTransaction().begin();
		entity.merge(inventario);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Inventario buscar(int id) {
		Inventario i = new Inventario();
		i = entity.find(Inventario.class, id);
		//JPAUtil.shutdown();
		return i;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Inventario i = new Inventario();
		i = entity.find(Inventario.class, id);
		entity.getTransaction().begin();
		entity.remove(i);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Inventario> obtenerInventario(){
		List<Inventario> listaInventario = new ArrayList<>();
		Query q = entity.createQuery("SELECT i FROM Inventario i");
		listaInventario = q.getResultList();
		return listaInventario;
	}
}