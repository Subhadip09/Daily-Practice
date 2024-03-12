package com.Anudip.batch7437_hibernate_class20;

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
//        
//        Student s = new Student(12, "Ayush", "Kolkata");
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
//        
//        EntityManager em = emf.createEntityManager();
//        // to insert data
//        em.getTransaction().begin();
//        
//        em.persist(s);
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
//        // to find the data
//        Student s11 = em.find(Student.class, 12);
//        // to show the data
//        System.out.println(s11);
        
//        // to delete data
//        Student s11 = em.find(Student.class, 12);
//        em.getTransaction().begin();
//      
//        em.remove(s11);
//      
//        em.getTransaction().commit();
//      
//        em.close();
        
//        em.getTransaction().begin();
//        
//        em.persist(s);
//      
//        em.getTransaction().commit();
//      
//        em.close();
        
//        // to set or update data
//        Student s11 = em.find(Student.class, 12);
//        
//        em.getTransaction().begin();
//        
//        s11.setAddress("Delhi");
//      
//        em.getTransaction().commit();
//      
//        em.close();
    	
    	Address a = new Address("Jaipur", "Rajasthan", "303807" );
    	
    	Student s = new Student(13, "Ayushi");
    	s.setAddress(a);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        
        EntityManager em = emf.createEntityManager();
        
//        Student s22 = em.find(Student.class, 13);
        
        em.getTransaction().begin();
        
        em.persist(s);
        
        em.getTransaction().commit();
        
        em.close();
        
    }
}
