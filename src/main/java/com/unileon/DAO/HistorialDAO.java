package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Historial;
import com.unileon.modelo.JPAUtil;

public class HistorialDAO
{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar historial
	public void guardarHistorial(Historial hist)
	{
		entity.getTransaction().begin();
		entity.persist(hist);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Editar historial
	public void editarHistorial(Historial hist)
	{
		entity.getTransaction().begin();
		entity.merge(hist);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Buscar historial
	public Historial buscar(int id)
	{
		Historial hist = new Historial();
		hist = entity.find(Historial.class, id);
		JPAUtil.shutdown();
		return hist;
	}
	
	//Obtener todos los historiales
	public List<Historial> obtenerCitas()
	{
		List<Historial> listaHistoriales = new ArrayList<>();
		Query query = entity.createQuery("SELECT h FROM historial h");
		listaHistoriales = query.getResultList();
		return listaHistoriales;
	}
}
