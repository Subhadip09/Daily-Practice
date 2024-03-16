package com.Anudip.mastarEmployee_class24_march15;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table(name = "employee_details")
//@NamedQuery(query = "select e from Employee e where e.empId = :id", name = "find by id")
//
//@NamedNativeQueries({
//	@NamedNativeQuery(
//			name = "findAll", 
//			query = "select * from employee_details",
//			resultClass = Employee.class
//			),
//	@NamedNativeQuery(
//			name = "findUnique", 
//			query = "select * from employee_details where empId < 23",
//			resultClass = Employee.class
//			)
//})
@Entity
public class Employee {
	@Id
	private int empId;
	
	private String name;
	
//	@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne
	private Department dept;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Car> carList;

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public Department getDepertment() {
		return dept;
	}

	public void setDepartment(Department dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}
