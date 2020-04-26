package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Administrador;

@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public AdministradorFacade() {
		super(Administrador.class);
	}
}
