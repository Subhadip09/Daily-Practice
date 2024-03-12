package com.Anudip.batch7437_hibernate_class20;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
//	private String Address;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.address = address;
	}
	
	public Student()
	{
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		address = addr;
//	}
//
//	public Student()
//	{
//		
//	}
//
////	public Student(int id, String name, Address address) {
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
////		address = address;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", Address=" + address + "]";
//	}
}
