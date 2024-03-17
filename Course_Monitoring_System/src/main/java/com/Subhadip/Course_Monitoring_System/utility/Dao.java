package com.Subhadip.Course_Monitoring_System.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	private static EntityManagerFactory emf = null;
	
	static {
		emf = Persistence.createEntityManagerFactory("Course");
	}
	
	public static EntityManager provideConnection()
	{
		return emf.createEntityManager();
	}
}
