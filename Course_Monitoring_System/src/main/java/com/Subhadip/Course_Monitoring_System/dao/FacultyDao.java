package com.Subhadip.Course_Monitoring_System.dao;

import com.Subhadip.Course_Monitoring_System.exception.FacultyException;
import com.Subhadip.Course_Monitoring_System.model.Faculty;

public interface FacultyDao {
	public String loginFaculty(Faculty f) throws FacultyException;
	
	public String getCoursePlanById(int id) throws FacultyException;
	
	public String fillUpDayWisePlan() throws FacultyException;
	
	public String updatePassword(int id) throws FacultyException;
}
