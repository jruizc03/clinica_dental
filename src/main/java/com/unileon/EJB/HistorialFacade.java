package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Historial;

@Stateless
public class HistorialFacade extends AbstractFacade<Historial>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public HistorialFacade() {
		super(Historial.class);
	}
}
