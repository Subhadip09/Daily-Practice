package lab2_feb15;

public class Employee extends User {

	double salary;
	
	Employee(int id, String name, double salary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
	double calculateAnnualSalary()
	{
		return salary*12;
	}
	//main method
	public static void main(String[] args) {
		Employee obj = new Employee(10, "Subhadip", 10000);
		System.out.println("The annual salary of "+ obj.name + " is " + obj.calculateAnnualSalary());
	}
}
