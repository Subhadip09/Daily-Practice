package com.Anudip.mastarEmployee_class24_march15;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpUnit");
        
        EntityManager em = emf.createEntityManager();
        
//        Department d = new Department(999, "CS");
        Department d1 = new Department(99, "ECE");
        
        Employee e = new Employee(101, "Raj");
        Car a = new Car(12, "Verna");
        a.setEmployeeId(101);
        Car a1 = new Car(2, "Scorpio");
        a1.setEmployeeId(101);
        List<Car> carList = new ArrayList<>();
        carList.add(a);
        carList.add(a1);
        e.setCarList(carList);
        
        e.setDepartment(d1);
//        
//        Employee e1 = new Employee(200, "Subha");
//        e1.setDept(d);
        
//        Employee e2 = new Employee(111, "Abhi");
//        e2.setDept(d1);
//        
        em.getTransaction().begin();
//        em.persist(d1);
        em.persist(e);
//        em.persist(e1);
//        em.persist(e2);
        
        em.getTransaction().commit();
        
        em.close();
	}
}
