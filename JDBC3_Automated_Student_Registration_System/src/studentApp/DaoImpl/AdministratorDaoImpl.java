package studentApp.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import studentApp.Dao.AdministratorDao;
import studentApp.Exception.AdminstratorException;
import studentApp.Exception.StudentException;
import studentApp.Model.Batch;
import studentApp.Model.Course;
import studentApp.Model.Student;
import studentApp.util.Dao;
import studentApp.util.QueryUtil;

public class AdministratorDaoImpl implements AdministratorDao{

	@Override
	public String addCourse(Course c) throws AdminstratorException {
		// TODO Auto-generated method stub
		String msg = "course not inserted";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.insertCourse());
			ps.setInt(1, c.getCourseId());
			ps.setString(2, c.getCourseName());
			ps.setDouble(3, c.getCourseFees());
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "course get inserted";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

	@Override
	public String updateFees(int id, double fees) throws AdminstratorException {
		// TODO Auto-generated method stub
		
		String msg = "fees not updated";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.updateFees());
			ps.setDouble(1, fees);
			ps.setInt(2, id);
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "fees get updated";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String deleteCourse(int id) throws AdminstratorException {
		// TODO Auto-generated method stub
		String msg = "course not deleted";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.deleteCourse());
			ps.setInt(1, id);
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "course get deleted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public Course searchInfoOfCourse(int id) throws AdminstratorException {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.searchInfoOfCourse());
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			boolean flag = false;
			
			while(rs.next())
			{
				flag = true;
				String name = rs.getString("name");
				double fees = rs.getDouble("fees");
				
				System.out.println("Course id: " + id + ", Course name: " + name + ", Course fees: " + fees);
			}
			
			if(flag == false)
			{
				throw new AdminstratorException("course not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String createBatchUnderCourse(int total_seat, int courseId) throws AdminstratorException {
		// TODO Auto-generated method stub
		String msg = "batch not created";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.createBatchUnderCourse());
			ps.setInt(1, total_seat);
			ps.setInt(2, courseId);
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "batch created";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Batch> allocateStudentInBatch() throws AdminstratorException {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.allocateStudentInBatch());
			
			ResultSet rs = ps.executeQuery();
			boolean flag = false;
			
			while(rs.next())
			{
				flag = true;
				String stuName = rs.getString("stu_name");
				int batchId = rs.getInt("batch_id");
				String courseName = rs.getString("course_name");
				
				System.out.println("Student Name: " + stuName + ", Batch Id: " + batchId + ", Course Name: " + courseName);
			}
			
			if(flag == false) {
				throw new AdminstratorException("you have done something wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateSeatsofBatch(int id, int total_seat) throws AdminstratorException {
		// TODO Auto-generated method stub
		String msg = "total seat not updated";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.updateTotalSeat());
			ps.setInt(1, total_seat);
			ps.setInt(2, id);
		
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "total seat updated";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Student> getAllStudentofEveryBatch() throws AdminstratorException {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getStudentOfEachBatch());
			
			ResultSet rs = ps.executeQuery();
			boolean flag = false;
			
			while(rs.next())
			{
				flag = true;
				int batchId = rs.getInt("batch_id");
				String stuName = rs.getString("stu_name");
				
				System.out.println("Batch Id: " + batchId + ", Student Name: " + stuName);
			}
			
			if(flag == false) {
				throw new AdminstratorException("you have done something wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
