package com.Subhadip.Course_Monitoring_System.daoImpl;

import java.util.List;

import com.Subhadip.Course_Monitoring_System.dao.AdminDao;
import com.Subhadip.Course_Monitoring_System.exception.AdminException;
import com.Subhadip.Course_Monitoring_System.model.Admin;
import com.Subhadip.Course_Monitoring_System.model.Batch;
import com.Subhadip.Course_Monitoring_System.model.Course;
import com.Subhadip.Course_Monitoring_System.model.CoursePlan;
import com.Subhadip.Course_Monitoring_System.model.Faculty;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String createAdmin(Admin a) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logInAdmin(Admin a) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCourse(Course c) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCourse(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCourseById(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourse() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createBatch(Batch b) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBatchById(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Batch> getAllBatch() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createFaculty(Faculty f) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFaculty(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFacultyById(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Faculty> getAllFaculty() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String allocateFacultyToBatch(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCoursePlan(CoursePlan cp) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCoursePlan(CoursePlan cp) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCoursePlanById(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoursePlan> getAllCoursePlan() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Batch> getDayWiseUpdateofEveryBatch() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateReportofEveryBatch(int id) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

}
