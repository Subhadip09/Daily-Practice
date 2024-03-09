package customerApp.Main;

import java.util.Scanner;

import customerApp.Dao.*;
import customerApp.DaoImplementation.CustomerDaoImplementation;
import customerApp.DaoImplementation.OrderDaoImplementation;
import customerApp.Exception.CustomerException;
import customerApp.Exception.OrderException;
import customerApp.Model.Customer;
import customerApp.Model.Orders;

public class CustomerMainStuff {

	private static Scanner sc = new Scanner(System.in);

	private static CustomerDao cdao = new CustomerDaoImplementation();

	private static OrderDao odao = new OrderDaoImplementation();

	public static void main(String[] args) {
		boolean flag = true;

		while (flag) {
			System.out.println();
			System.out.println();
			System.out.println("Welcome🙏🙏🙏");
			System.out.println("enter 1 for insert data");
			System.out.println("enter 2 for delete data");
			System.out.println("enter 3 for update data");
			System.out.println("enter 4 for get all data");
			System.out.println("enter 5 for get data by id");
			System.out.println("enter 7 for order something");
			System.out.println("enter 8 for delete order");
			System.out.println("enter 9 for get all order");
			System.out.println("enter 10 for get order by id");
			System.out.println("enter 11 for get the highest valued order of particular customer");
			System.out.println("enter 12 for get all order of a particular customer");
			System.out.println("enter 13 for get customerwise total order");
			System.out.println("enter 6 for exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				try {
					System.out.println("you want to register customer");

					System.out.println("enter id of customer");
					int id = sc.nextInt();

					System.out.println("enter the name of customer");
					String name = sc.next();

					System.out.println("enter the password of customer");
					String password = sc.next();

					System.out.println("enter the address of customer");
					String address = sc.next();

					String msg = cdao.registerCustomer(new Customer(id, name, password, address));

					if (msg.equals("data not inserted")) {
						throw new CustomerException("you have done something wrong");
					}
					System.out.println(msg);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					System.out.println("you want to delete customer");

					System.out.println("enter id of customer");
					int id = sc.nextInt();

					String msg = cdao.deleteCustomer(id);

					if (msg.equals("data not deleted")) {
						throw new CustomerException("you have done something wrong");
					}
					System.out.println(msg);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 3:
				try {
					System.out.println("you want to update customer");

					System.out.println("enter id of customer");
					int id = sc.nextInt();

					System.out.println("enter the name of customer");
					String name = sc.next();

					System.out.println("enter the password of customer");
					String password = sc.next();

					System.out.println("enter the address of customer");
					String address = sc.next();

					String msg = cdao.updateCustomer(new Customer(id, name, password, address));

					if (msg.equals("data not updated")) {
						throw new CustomerException("you have done something wrong");
					}
					System.out.println(msg);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("you want to get all data of customer");
				cdao.getAllCustomer();
				break;
			
			case 5:
				try {
					System.out.println("you want to get data of customer by id");

					System.out.println("enter id of customer");
					int id = sc.nextInt();
					
					cdao.getCustomerById(id);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 6:
				flag = false;
				System.out.println("Thankyou for visiting 🙏🙏🙏🙏🙏");
				break;
				
			case 7:

				System.out.println("you want to order something");

//				System.out.println("enter order id");
//				int id = sc.nextInt();

				System.out.println("enter the name of order");
				String name = sc.next();

				System.out.println("enter the value of the order");
				double value = sc.nextDouble();

				System.out.println("enter the customer id");
				int cusId = sc.nextInt();

//				String msg = odao.doingOrder(new Orders(id, name, value, cusId));
				String msg = odao.doingOrder(new Orders(name, value, cusId));
				
				System.out.println(msg);

				break;
			case 8:
				System.out.println("you want to delete order");

				System.out.println("enter id of order");
				int id = sc.nextInt();

				String msg1 = odao.deleteOrder(id);

				System.out.println(msg1);
				
				break;
				
			case 9:
				System.out.println("you want to get all data of order");
				odao.getAllOrder();
				break;
				
			case 10:
				try {
					System.out.println("you want to get data of order by id");

					System.out.println("enter id of order");
					int id1 = sc.nextInt();
						
					odao.getOrderById(id1);
					
				}catch (OrderException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
				
			case 11:
				System.out.println("you want to get highest valued order of particular customer");
				
				odao.getHighestValuedOrderOfParticularCustomer();
				break;
			case 12:
				System.out.println("you want to get all orders of a customer");
				
				System.out.println("enter the id of customer");
				int cusId1 = sc.nextInt();
				
				odao.getAllOrderValue(cusId1);
				break;
			case 13:
				System.out.println("you want to get all customers no of total order");
				odao.getCustomerWiseTotalOrder();
				break;
			}
		}
	}
}
