package com.Anudip.hibernate_class22;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studentAddress") // agar @Table(name = "sample_name") tab table k naam change ho jata hai 
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
//	private String Address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "current_city")),
		@AttributeOverride(name = "state", column = @Column(name = "current_state")),
		@AttributeOverride(name = "pincode", column = @Column(name = "current_pincode"))
	})
	private Address current_address;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "home_city")),
		@AttributeOverride(name = "state", column = @Column(name = "home_state")),
		@AttributeOverride(name = "pincode", column = @Column(name = "home_pincode"))
	})
	private Address home_address;


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(Address current_address) {
		this.current_address = current_address;
	}

	public Address getHome_address() {
		return home_address;
	}

	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

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
		return "Student [id=" + id + ", name=" + name +"]";
	}
}
