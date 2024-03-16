package com.Anudip.mastarEmployee_class24_march15.different;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpUnit");
		EntityManager em = emf.createEntityManager();
		
		Pen p = new Pen();
		p.setColor("Blue");
		p.setId(23);
		p.setName("Renolds");
		
		em.getTransaction().begin();
		
		em.persist(p);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
