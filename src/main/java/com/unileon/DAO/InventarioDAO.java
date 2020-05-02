package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Inventario;
import com.unileon.modelo.JPAUtil;

public class InventarioDAO
{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar inventario
	public void guardarInventario(Inventario inv)
	{
		entity.getTransaction().begin();
		entity.persist(inv);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Editar invetario
	public void editarInventario(Inventario inv)
	{
		entity.getTransaction().begin();
		entity.merge(inv);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Buscar inventario
	public Inventario buscarHerramienta(int id)
	{
		Inventario inv = new Inventario();
		inv = entity.find(Inventario.class, id);
		JPAUtil.shutdown();
		return inv;
	}
	
	//Obtener el inventario
	public List<Inventario> obtenerHerramienta()
	{
		List<Inventario> listaHerramientas = new ArrayList<>();
		Query query = entity.createQuery("SELECT h FROM inventario h");
		listaHerramientas = query.getResultList();
		return listaHerramientas;
	}
}
