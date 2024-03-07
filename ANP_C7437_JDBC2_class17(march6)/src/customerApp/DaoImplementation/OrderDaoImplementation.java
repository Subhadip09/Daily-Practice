package customerApp.DaoImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import customerApp.Dao.OrderDao;
import customerApp.Model.Orders;
import customerApp.util.Dao;
import customerApp.util.QueryUtil;

public class OrderDaoImplementation implements OrderDao{

	@Override
	public String doingOrder(Orders o) {
		// TODO Auto-generated method stub
		String msg = "not ordered";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.insertOrder());
//			ps.setInt(1, o.getOrderId());
			ps.setString(1, o.getOrderName());
			ps.setDouble(2, o.getOrderValue());
			ps.setInt(3, o.getCusId());
			
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
	public String deleteOrder(int id) {
		// TODO Auto-generated method stub
		String msg = "data not deleted";
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.deleteOrder());
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
	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getAllOrder());
			// to get all the data row is not used. ResultSet use hota hai
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String orderName = rs.getString("oname");
				String orderValue = rs.getString("ovalue");
				String customerId = rs.getString("customerId");
				
				System.out.println("Order Id: " + id + ", Order Name: " + orderName + ", Order Value: " + orderValue + ", Customer Id: " + customerId);
			}
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Orders getOrderById(int id)
	{
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getOrderById());
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String orderName = rs.getString("oname");
				String orderValue = rs.getString("ovalue");
				String customerId = rs.getString("customerId");
				
				System.out.println("Order Id: " + id + ", Order Name: " + orderName + ", Order Value: " + orderValue + ", Customer Id: " + customerId);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Orders getHighestValuedOrderOfParticularCustomer() {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getHighestValuedOrderOfCustomer());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String cusName = rs.getString("c.name");
				String orderValue = rs.getString("highest_valued_order");
				
				System.out.println("Customer Name: " + cusName + ", Order Value: " + orderValue);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public double getAllOrderValue(int cusId) {
		// TODO Auto-generated method stub
		try(Connection con = Dao.provideConnection())
		{
			PreparedStatement ps = con.prepareStatement(QueryUtil.getAllOrderValue());
			// to get all the data row is not used. ResultSet use hota hai
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String orderName = rs.getString("oname");
				String orderValue = rs.getString("ovalue");
				String customerId = rs.getString("customerId");
				
				System.out.println("Order Id: " + id + ", Order Name: " + orderName + ", Order Value: " + orderValue + ", Customer Id: " + customerId);
			}
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void getCustomerWiseTotalOrder() {
		// TODO Auto-generated method stub
		
	}

}
