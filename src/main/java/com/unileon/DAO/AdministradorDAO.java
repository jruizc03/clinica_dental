package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Administrador;
import com.unileon.modelo.JPAUtil;

public class AdministradorDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar administrador
	public void guardar(Administrador administrador) {
		entity.getTransaction().begin();
		entity.persist(administrador);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//editar administrador
	public void editar(Administrador administrador) {
		entity.getTransaction().begin();
		entity.merge(administrador);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//buscar cliente
	public Administrador buscar(int id) {
		Administrador a = new Administrador();
		a = entity.find(Administrador.class, id);
		JPAUtil.shutdown();
		return a;
	}
	
	//obtener todos los administradores
	public List<Administrador> obtenerAdmins(){
		List<Administrador> listaAdmins = new ArrayList<>();
		Query q = entity.createQuery("SELECT a FROM ADMINISTRADOR a");
		listaAdmins = q.getResultList();
		return listaAdmins;
	}
}
