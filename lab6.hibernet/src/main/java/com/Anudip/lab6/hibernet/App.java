package com.Anudip.lab6.hibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	Address a1 = new Address("Kolkata", "West Bengal", "700001");
    	
    	Employee s1 = new Employee(10, "Rajdip");
    	s1.setAddress(a1);
    	
    	Address a2 = new Address("Jaipur", "Rajasthan", "303807");
    	
    	Employee s2 = new Employee(15, "Ayushi");
    	s2.setAddress(a2);
    	
    	Address a3 = new Address("Noida", "Up", "765893");
    	
    	Employee s3 = new Employee(14, "Abhishek");
    	s3.setAddress(a3);
    	
    	Address a4 = new Address("Kolkata", "West Bengal", "700001");
    	
    	Employee s4 = new Employee(20, "Ishika");
    	s4.setAddress(a4);
    	
    	Address a5 = new Address("Durgapur", "West Bengal", "700023");
    	
    	Employee s5 = new Employee(11, "Subhadip");
    	s5.setAddress(a5);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	//insert data
    	em.getTransaction().begin();
    	
    	em.persist(s1);
    	em.persist(s2);
    	em.persist(s3);
    	em.persist(s4);
    	em.persist(s5);
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	
    	// to find the data
    	Employee e11 = em.find(Employee.class, 11);
    	// to show the data
    	System.out.println(e11);
    	
    	// to set or update data
      
    	em.getTransaction().begin();
      
    	e11.setAddress(a1);
    
    	em.getTransaction().commit();
    
    	em.close();
    	
    	// to delete data
    	Employee e14 = em.find(Employee.class, 14);
    	em.getTransaction().begin();
    
    	em.remove(e14);
    
    	em.getTransaction().commit();
    
    	em.close();
    	
    }
}
