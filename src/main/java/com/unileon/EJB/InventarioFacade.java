package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Inventario;

@Stateless
public class InventarioFacade extends AbstractFacade<Inventario>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public InventarioFacade() {
		super(Inventario.class);
	}
}
