package customerApp.Dao;

import java.util.List;

import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;

// to connect Customer to the database
public interface CustomerDao {
	public String registerCustomer(Customer c) throws CustomerException;
	
	public String deleteCustomer(int id) throws CustomerException;
	
	public String updateCustomer(Customer c);
	
	public List<Customer> getAllCustomer();
	
	public Customer getCustomerById(int id) throws CustomerException;
	
}
