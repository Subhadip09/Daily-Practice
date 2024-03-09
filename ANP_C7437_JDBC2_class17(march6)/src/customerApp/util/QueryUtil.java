package customerApp.util;

public class QueryUtil {
	public static String insertData()
	{
		return "insert into customer values(?, ?, ?, ?)";
	}
	
	public static String deleteData()
	{
		return "delete from customer where id = ?";
	}
	
	public static String updateData()
	{
		return "update customer set name = ?, password = ?, address = ? where id = ?";
	}
	
	public static String getAllData()
	{
		return "select * from customer";
	}
	
	public static String getDataById()
	{
		return "select * from customer where id = ?";
	}
	// orders query
	public static String insertOrder()
	{
		return "insert into orders(oname, ovalue, customerId)  values(?, ?, ?)";
	}
	
	public static String deleteOrder()
	{
		return "delete from orders where id = ?";
	}
	
	public static String getAllOrder() 
	{
		return "select * from orders";
	}
	
	public static String getOrderById()
	{
		return "select * from orders where id = ?";
	}
	
	public static String getHighestValuedOrderOfCustomer()
	{
		return "select c.name, max(o.ovalue) as highest_valued_order from customer c inner join orders o on c.id = o.customerId group by c.id"; 
	}
	public static String getAllOrderValue()
	{
		return "select c.id, c.name, c.address, o.id, o.oname, o.ovalue from customer c inner join orders o on c.id = o.customerId where o.customerId = ?";
	}
	
	public static String getCustomersTotalOrder()
	{
		return "select c.name, count(o.id) as totalOrder from customer c inner join orders o on c.id = o.customerId group by c.name";
	}
}
