package customerApp.Dao;

import java.util.List;

import customerApp.Model.Orders;

public interface OrderDao {
	public String doingOrder(Orders o) ;
	
	public String deleteOrder(int id);
	
	public List<Orders> getAllOrder();
	
	public Orders getOrderById(int id);
	
	public Orders getHighestValuedOrderOfParticularCustomer();
	
	public double getAllOrderValue(int cusId);
	
	public void getCustomerWiseTotalOrder();
}
