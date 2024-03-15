package com.Anudip.mastarEmployee_class24_march15;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpUnit");
        
        EntityManager em = emf.createEntityManager();

//        Employee e = new Employee(12, "Rahul");
//        // to insert data
//        em.getTransaction().begin();
//        
//        em.persist(e);
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
//        // to find data
//        Employee e1 = em.find(Employee.class, 12);
//        System.out.println(e1);
//        
//        em.getTransaction().begin();
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
//          // to update data
//        e1.setName("Subhadip");
//        
//        em.getTransaction().begin();
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
//        // to remove data
//        em.remove(e1);
//        
//        em.getTransaction().begin();
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
        // to get the list of employee name 
        Query query = em.createQuery("select upper(name) from Employee");
        
        List<String> list = query.getResultList();
        
        for(String s : list)
        {
        	System.out.println(s);
        }
//        em.close();
        
        // to get the all employee details
        Query query1 = em.createQuery("select emp from Employee emp");
        
        List<Employee> list1 = query1.getResultList();
        
        for(Employee e : list1)
        {
        	System.out.println(e);
        }
        
        // to get all employee name
        Query query2 = em.createQuery("select emp from Employee emp");
        
        List<Employee> list2 = query2.getResultList();
        
        for(Employee e : list2)
        {
        	System.out.println(e.getName());
        }
        
        // to get the employee in between specific employee_id
        Query query3 = em.createQuery("select emp from Employee emp where emp.empId Between 12 and 232");
        
        List<Employee> list3 = query3.getResultList();
        
        for(Employee e : list3)
        {
        	System.out.println(e);
        }
        
        // to access the @NamedQuery of Employee
        Query q = em.createNamedQuery("find by id");
        q.setParameter("id", 232);
        
        Employee e = (Employee) q.getSingleResult();
        
        System.out.println(e.getName());
        
        // to use sql query in hibernate native query is used
        Query q1 = em.createNativeQuery("select * from employee_details", Employee.class);
        
        List<Employee> list4 = q1.getResultList();
        
        for(Employee e1 : list4)
        {
        	System.out.println(e1);
        }
        
        // to get data from @NamedNativeQuery
        Query q2 = em.createNamedQuery("findAll");
        List<Employee> list5 = q2.getResultList();
        
        for(Employee e2 : list5)
        {
        	System.out.println(e2);
        }
        
        Query q3 = em.createNamedQuery("findUnique");
        Employee e3 = (Employee) q3.getSingleResult();
        System.out.println(e3);
        
    }
}
