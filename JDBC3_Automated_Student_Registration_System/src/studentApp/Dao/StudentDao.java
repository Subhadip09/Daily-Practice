package studentApp.Dao;

import studentApp.Exception.StudentException;
import studentApp.Model.Course;
import studentApp.Model.Student;

public interface StudentDao {
	public String registerStudent(Student s);
	
	public String updateStudentDetails(Student s);
	
	//public Course getAllUpdate();
	
	public void availableCourseWithSeats() throws StudentException;
}
