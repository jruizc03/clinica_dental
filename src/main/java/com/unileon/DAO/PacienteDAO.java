package com.unileon.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.unileon.modelo.Paciente;
import com.unileon.modelo.JPAUtil;

public class PacienteDAO
{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		//Guardar paciente
		public void guardarPaciente(Paciente pac)
		{
			entity.getTransaction().begin();
			entity.persist(pac);
			entity.getTransaction().commit();
			JPAUtil.shutdown();
		}
		
		//Editar paciente
		public void editarHistorial(Paciente pac)
		{
			entity.getTransaction().begin();
			entity.merge(pac);
			entity.getTransaction().commit();
			JPAUtil.shutdown();
		}
		
		//Buscar paciente
		public Paciente buscar(int id)
		{
			Paciente pac = new Paciente();
			pac = entity.find(Paciente.class, id);
			JPAUtil.shutdown();
			return pac;
		}
		
		//Obtener todos los pacientes
		public List<Paciente> obtenerPacientes()
		{
			List<Paciente> listaPacientes = new ArrayList<>();
			Query query = entity.createQuery("SELECT p FROM paciente p");
			listaPacientes = query.getResultList();
			return listaPacientes;
		}
}
