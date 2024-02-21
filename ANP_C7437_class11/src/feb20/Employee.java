package feb20;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSalary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	// ye method automatic hi ayi hai, jab aap comparable interface ko use karoge
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getEmpSalary() == o.getEmpSalary())
		{
			return 0;
		}
		else if(this.getEmpSalary() > o.getEmpSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
//		if(this.getEmpName() == o.getEmpName())
//		{
//			return 0;
//		}
//		else if(this.getEmpName() > o.getEmpName())
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
//		
		
		// done this also for id & age 
		
		// 20th feb
		// I want to sort the data on the basis of name, string, id
		// Then Comparator interface is used
	}
}

