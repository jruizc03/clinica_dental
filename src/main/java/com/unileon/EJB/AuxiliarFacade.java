package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Auxiliar;

@Stateless
public class AuxiliarFacade extends AbstractFacade<Auxiliar>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public AuxiliarFacade() {
		super(Auxiliar.class);
	}
}
