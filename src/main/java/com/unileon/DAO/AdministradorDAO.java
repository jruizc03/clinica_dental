package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Administrador;
import com.unileon.modelo.JPAUtil;

public class AdministradorDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar doctor
	public void guardar(Administrador admin) {
		entity.getTransaction().begin();
		entity.persist(admin);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//editar doctor
	public void editar(Administrador admin) {
		entity.getTransaction().begin();
		entity.merge(admin);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	//buscar doctor
	public Administrador buscar(int id) {
		Administrador a = new Administrador();
		a = entity.find(Administrador.class, id);
		//JPAUtil.shutdown();
		return a;
	}
	
	//eliminar doctor
	public void eliminar(int id) {
		Administrador a = new Administrador();
		a = entity.find(Administrador.class, id);
		entity.getTransaction().begin();
		entity.remove(a);
		entity.getTransaction().commit();
	}
	
	//obtener todos los doctores
	public List<Administrador> obtenerAdministradores(){
		List<Administrador> listaAdmins = new ArrayList<>();
		Query q = entity.createQuery("SELECT a FROM Administrador a");
		listaAdmins = q.getResultList();
		return listaAdmins;
	}
}