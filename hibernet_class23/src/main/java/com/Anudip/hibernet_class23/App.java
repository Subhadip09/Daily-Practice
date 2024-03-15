package com.Anudip.hibernet_class23;

import java.util.ArrayList;
import java.util.List;

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
    	Address a = new Address("Pune", "Maharastra", "302875");
        Address a1 = new Address("Jaipur", "Rajasthan", "303807");
        Student s = new Student(10, "Subhadip");
        
        List<Address> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
        
        s.setAddress(list);
        
//        s.setAddress(a);
//        s.setHome_address(a);
//        s.setCurrent_address(a1);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(s);
        
        em.getTransaction().commit();
        
        em.close();
    }
}
