package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public PacienteFacade() {
		super(Paciente.class);
	}
}
