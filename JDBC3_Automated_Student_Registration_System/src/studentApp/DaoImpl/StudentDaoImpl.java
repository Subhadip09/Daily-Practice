package studentApp.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import studentApp.Dao.StudentDao;
import studentApp.Exception.StudentException;
import studentApp.Model.Student;
import studentApp.util.Dao;
import studentApp.util.QueryUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(Student s) {
		// TODO Auto-generated method stub
		String msg = "student not registered";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.registerStudent());
			ps.setInt(1, s.getId());
			ps.setString(2, s.getUserName());
			ps.setString(3, s.getPassword());
			ps.setInt(4, s.getCourseId());
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "student get registered";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String updateStudentDetails(Student s) {
		// TODO Auto-generated method stub
		String msg = "student details not updated";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.updateStudentDetails());
			
			ps.setString(1, s.getUserName());
			ps.setString(2, s.getPassword());
			ps.setInt(3, s.getCourseId());
			ps.setInt(4, s.getId());
			
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				msg = "student details updated";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public void availableCourseWithSeats() throws StudentException {
		// TODO Auto-generated method stub
		
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.availableCourseWithSeats());
			
			ResultSet rs = ps.executeQuery();
			boolean flag = false;
			
			while(rs.next())
			{
				flag = true;
				int id = rs.getInt("c.id");
				String courseName = rs.getString("course");
				int availableSeat = rs.getInt("available_seat");
				
				System.out.println("Course Id: " + id + ", Course Name: " + courseName + ", Total Available Seats: " + availableSeat);
			}
			
			if(flag == false) {
				throw new StudentException("you have done something wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
