package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Cita;
import com.unileon.modelo.JPAUtil;

public class CitaDAO
{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar cita
	public void guardarCita(Cita cita)
	{
		entity.getTransaction().begin();
		entity.persist(cita);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Editar cita
	public void editarCita(Cita cita)
	{
		entity.getTransaction().begin();
		entity.merge(cita);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	//Buscar cita
	public Cita buscar(int id)
	{
		Cita cita = new Cita();
		cita = entity.find(Cita.class, id);
		JPAUtil.shutdown();
		return cita;
	}
	
	//Obtener todas las citas
	public List<Cita> obtenerCitas()
	{
		List<Cita> listaCitas = new ArrayList<>();
		Query query = entity.createQuery("SELECT c FROM Cita c");
		listaCitas = query.getResultList();
		return listaCitas;
	}
	
	//Obtener citas de un doctor
	
	
}
