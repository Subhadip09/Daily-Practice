package com.Subhadip.Course_Monitoring_System.dao;

import java.util.List;

import com.Subhadip.Course_Monitoring_System.exception.AdminException;
import com.Subhadip.Course_Monitoring_System.model.Admin;
import com.Subhadip.Course_Monitoring_System.model.Batch;
import com.Subhadip.Course_Monitoring_System.model.Course;
import com.Subhadip.Course_Monitoring_System.model.CoursePlan;
import com.Subhadip.Course_Monitoring_System.model.Faculty;


public interface AdminDao {
	public String createAdmin(Admin a) throws AdminException;
	
	public String logInAdmin(Admin a) throws AdminException;
	
	public String createCourse(Course c) throws AdminException;
	
	public String updateCourse(int id) throws AdminException;
	
	public String getCourseById(int id) throws AdminException;
	
	public List<Course> getAllCourse() throws AdminException;
	
	public String createBatch(Batch b) throws AdminException;
	
	public String updateBatch(int id) throws AdminException;
	
	public String getBatchById(int id) throws AdminException;
	
	public List<Batch> getAllBatch() throws AdminException;
	
	public String createFaculty(Faculty f) throws AdminException;
	
	public String updateFaculty(int id) throws AdminException;
	
	public String getFacultyById(int id) throws AdminException;
	
	public List<Faculty> getAllFaculty() throws AdminException;
	
	public String allocateFacultyToBatch(int id) throws AdminException;
	
	public String createCoursePlan(CoursePlan cp) throws AdminException;
	
	public String updateCoursePlan(CoursePlan cp) throws AdminException;
	
	public String getCoursePlanById(int id) throws AdminException;
	
	public List<CoursePlan> getAllCoursePlan() throws AdminException;
	
	public List<Batch> getDayWiseUpdateofEveryBatch() throws AdminException;
	
	public String generateReportofEveryBatch(int id) throws AdminException;
}
