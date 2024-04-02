package com.Subhadip.Course_Monitoring_System;

import java.util.*;

import com.Subhadip.Course_Monitoring_System.daoImpl.AdminDaoImpl;
import com.Subhadip.Course_Monitoring_System.daoImpl.FacultyDaoImpl;
import com.Subhadip.Course_Monitoring_System.exception.AdminException;
import com.Subhadip.Course_Monitoring_System.model.Admin;
import com.Subhadip.Course_Monitoring_System.dao.AdminDao;
import com.Subhadip.Course_Monitoring_System.dao.FacultyDao;

public class MainOperation {
	private static Scanner sc = new Scanner(System.in);
	
	private static AdminDao adao = new AdminDaoImpl();
	private static FacultyDao fdao = new FacultyDaoImpl();
	
	public static void main(String[] args) {
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("Enter 1 for Admin");
			System.out.println("Enter 2 for Faculty");
			System.out.println("Enter 100 for Exit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter 11 for Log in");
				System.out.println("Enter 12 for Sign up");
				System.out.println("Enter 20 for Exit");
				
				int choice1 = sc.nextInt();
				
				switch(choice1)
				{
				case 11:
					System.out.println("Enter admin username");
					String username = sc.next();
					
					System.out.println("Enter admin password");
					String password = sc.next();
					
					try {
						Admin a = new Admin();
						String user = a.getUserName();
						String pass = a.getPassword();
						
						if(username != user && password != pass)
						{
							throw new AdminException("You have done something wrong");
						}
					}catch(AdminException e)
					{
						e.printStackTrace();
					}
					break;
				case 12:
					System.out.println("Enter admin id");
					int adminId = sc.nextInt();
					
					System.out.println("Enter admin username");
					String adminuserName = sc.next();
					
					System.out.println("Enter admin password");
					String adminpassword = sc.next();
					
					try {
						Admin a = new Admin(adminId, adminuserName, adminpassword);
						
						adao.createAdmin(a);
						
					}catch(AdminException e)
					{
						e.printStackTrace();
					}
				}
			case 3:
				flag = false;
				break;
			}
		}
	}
	
}
