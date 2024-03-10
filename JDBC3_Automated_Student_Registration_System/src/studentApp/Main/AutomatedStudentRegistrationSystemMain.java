package studentApp.Main;

import java.util.*;

import studentApp.DaoImpl.AdministratorDaoImpl;
import studentApp.DaoImpl.StudentDaoImpl;
import studentApp.Exception.AdminstratorException;
import studentApp.Exception.StudentException;
import studentApp.Model.*;
import studentApp.Dao.AdministratorDao;
import studentApp.Dao.StudentDao;

public class AutomatedStudentRegistrationSystemMain {
	private static Scanner sc = new Scanner(System.in);
	
	private static AdministratorDao adao = new AdministratorDaoImpl();
	
	private static StudentDao sdao = new StudentDaoImpl();
	
	public static void main(String[] args) {
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("🙏🙏🙏Welcome🙏🙏🙏");
			System.out.println("enter 1 for administrator");
			System.out.println("enter 2 for student");
			System.out.println("enter 3 for exit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					while(flag)
					{
						System.out.println();
						System.out.println("------Administrator------");
						System.out.println("enter 11 for add course");
						System.out.println("enter 12 for update fees");
						System.out.println("enter 13 for delete course");
						System.out.println("enter 14 for search course");
						System.out.println("enter 15 for create batch under a course");
						System.out.println("enter 16 for allocate student in batch of a course");
						System.out.println("enter 17 for update total seats of a batch");
						System.out.println("enter 18 for get all student of each batch");
						System.out.println("enter 20 for exit");
					
						int choice1 = sc.nextInt();
						switch(choice1)
						{
							case 11:
						
								try 
								{
									System.out.println("you want to add course");
							
									System.out.println("enter id of course");
									int id = sc.nextInt();
							
									System.out.println("enter name of course");
									String name = sc.next();
							
									System.out.println("enter fees of course");
									double fees = sc.nextDouble();
							
									String msg = adao.addCourse(new Course(id, name, fees));
							
									if(msg.equals("course not inserted"))
									{
										throw new AdminstratorException("you have done something wrong");
									}
									System.out.println(msg);
								} catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
							
							case 12:
								try {
									System.out.println("you want to update course fees");
									
									System.out.println("enter course id");
									int id = sc.nextInt();
									
									System.out.println("enter new fees");
									double fees = sc.nextDouble();
									
									String msg = adao.updateFees(id, fees);
									
									if(msg.equals("fees not updated"))
									{
										throw new AdminstratorException("you have done something wrong");
									}
									System.out.println(msg);
								}catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								break;
							
							case 13:
								try {
									System.out.println("you want to delete course");
									
									System.out.println("enter the course id which you want to delete");
									int id = sc.nextInt();
									
									String msg = adao.deleteCourse(id);
									
									if(msg.equals("course not deleted"))
									{
										throw new AdminstratorException("you have done something wrong");
									}
									System.out.println(msg);
								}catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
								
							case 14:
								try {
									System.out.println("you want to search information of a course");
									
									System.out.println("enter id of the course");
									int id = sc.nextInt();
									
									Course msg = adao.searchInfoOfCourse(id);
									
								}catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									System.out.println(e.getMessage());
								}
								break;
								
							case 15:
								try 
								{
									System.out.println("you want to create batch under a course");
							
									System.out.println("enter total seat of batch");
									int totalSeat = sc.nextInt();
									
									System.out.println("enter course id of batch");
									int courseId = sc.nextInt();
							
									String msg = adao.createBatchUnderCourse(totalSeat, courseId);
							
									if(msg.equals("batch not created"))
									{
										throw new AdminstratorException("you have done something wrong");
									}
									System.out.println(msg);
								} catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
								
							case 16:
								try {
									System.out.println("you want to see available course list and their seat availablity");
									
									adao.allocateStudentInBatch();
									
								} catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								break;
								
							case 17:
								try {
									System.out.println("you want to update ctotal seats of batch");
									
									System.out.println("enter batch id");
									int id = sc.nextInt();
									
									System.out.println("enter updated total seats");
									int total_seat = sc.nextInt();
									
									String msg = adao.updateSeatsofBatch(id, total_seat);
									
									if(msg.equals("total seat not updated"))
									{
										throw new AdminstratorException("you have done something wrong");
									}
									System.out.println(msg);
								}catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								break;
								
							case 18:
								try {
									System.out.println("you want to get all students of each batch");
									
									adao.getAllStudentofEveryBatch();
									
								} catch (AdminstratorException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								break;
								
								
							case 20:
								flag = false;
								System.out.println("thank you for visiting🙏🙏🙏");
								break;
						}
					}
				case 2:
					while(flag)
					{
						System.out.println();
						System.out.println("------Student------");
						System.out.println("enter 21 for register");
						System.out.println("enter 22 for update details");
						System.out.println("enter 23 for available course list and their seat availablity");
						System.out.println("enter 30 for exit");
						
						int choice2 = sc.nextInt();
						
						switch(choice2)
						{
						 case 21:
							 try 
								{
									System.out.println("you want to register");
							
									System.out.println("enter id of student");
									int id = sc.nextInt();
							
									System.out.println("enter user name of student");
									String userName = sc.next();
							
									System.out.println("enter password of student");
									String password = sc.next();
									
									System.out.println("enter course id of student");
									int courseId = sc.nextInt();
							
									String msg = sdao.registerStudent(new Student(id, userName, password, courseId));
							
									if(msg.equals("course not inserted"))
									{
										throw new StudentException("you have done something wrong");
									}
									System.out.println(msg);
								} catch (StudentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
								
						 case 22:
							 try 
								{
									System.out.println("you want to update student details");
							
									System.out.println("enter id of student");
									int id = sc.nextInt();
							
									System.out.println("enter new username of student");
									String userName = sc.next();
							
									System.out.println("enter new password of student");
									String password = sc.next();
									
									System.out.println("enter course id of student");
									int courseId = sc.nextInt();
							
									String msg = sdao.updateStudentDetails(new Student(id, userName, password, courseId));
							
									if(msg.equals("student details not updated"))
									{
										throw new StudentException("you have done something wrong");
									}
									System.out.println(msg);
								} catch (StudentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
								
						 case 23:
							 try 
								{
									System.out.println("you want to see available course list and their seat availablity");
							
									sdao.availableCourseWithSeats();
							
									
								} catch (StudentException e) {
									// TODO Auto-generated catch block
									System.out.println(e.getMessage());
								}
							 	break;
						 case 30:
							 flag = false;
							 break;
						}
					}
				case 3:
					flag = false;
					break;
			}
		}
	}
}
