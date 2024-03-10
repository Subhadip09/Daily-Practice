package studentApp.Dao;

import java.util.List;

import studentApp.Exception.AdminstratorException;
import studentApp.Model.Batch;
import studentApp.Model.Course;
import studentApp.Model.Student;

public interface AdministratorDao {
	public String addCourse(Course c) throws AdminstratorException;
	
	public String updateFees(int id, double fees) throws AdminstratorException;
	
	public String deleteCourse(int id) throws AdminstratorException;
	
	public Course searchInfoOfCourse(int id) throws AdminstratorException;
	
	public String createBatchUnderCourse(int total_seat, int courseId) throws AdminstratorException;
	
	public List<Batch> allocateStudentInBatch() throws AdminstratorException;
	
	public String updateSeatsofBatch(int id, int total_seat) throws AdminstratorException;
	
	public List<Student> getAllStudentofEveryBatch() throws AdminstratorException;
}
