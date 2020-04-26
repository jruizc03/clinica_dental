package com.unileon.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.unileon.modelo.Doctor;

@Stateless
public class DoctorFacade extends AbstractFacade<Doctor>{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public DoctorFacade() {
		super(Doctor.class);
	}
}
