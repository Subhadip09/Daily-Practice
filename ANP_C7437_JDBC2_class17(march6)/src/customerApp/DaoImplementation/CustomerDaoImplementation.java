package customerApp.DaoImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import customerApp.Dao.*;
import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;
import customerApp.util.Dao;
import customerApp.util.QueryUtil;

public class CustomerDaoImplementation implements CustomerDao{

	@Override
	public String registerCustomer(Customer c) throws CustomerException {
		// TODO Auto-generated method stub
		String msg = "data not inserted";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.insertData());
			ps.setInt(1, c.getCusId());
			ps.setString(2, c.getCusName());
			ps.setString(3, c.getCusPassword());
			ps.setString(4, c.getCusAddress());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				msg = "data get inserted";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String deleteCustomer(int id) throws CustomerException {
		// TODO Auto-generated method stub
		String msg = "data not deleted";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.deleteData());
			ps.setInt(1, id);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				msg = "data get deleted";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		String msg = "data not updated";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.updateData());
			ps.setString(1, c.getCusName());
			ps.setString(2, c.getCusPassword());
			ps.setString(3, c.getCusAddress());
			ps.setInt(4, c.getCusId());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				msg = "data get updated";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getAllData());
			// to get all the data row is not used. ResultSet use hota hai
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String address = rs.getString("address");
				
				System.out.println("Customer Id: " + id + ", Customer Name: " + name + ", Customer Password: " + password + ", Customer Address: " + address);
			}
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer getCustomerById(int id) throws CustomerException {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getDataById());
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("name");
				String password = rs.getString("password");
				String address = rs.getString("address");
				
				System.out.println("Customer Id: " + id + ", Customer Name: " + name + ", Customer Password: " + password + ", Customer Address: " + address);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
