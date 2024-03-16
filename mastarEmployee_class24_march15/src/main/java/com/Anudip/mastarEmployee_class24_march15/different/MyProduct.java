package com.Anudip.mastarEmployee_class24_march15.different;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

// Is-A relationship
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED) // It creates separate tables for every classes
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // It creates a single table for all class
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // It bring parent class's property in child class

@MappedSuperclass // It does not create parent table & does not use @Entity & it bring parent table property in child table
public class MyProduct {
	@Id
	private int id;
	
	private String name;

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

	@Override
	public String toString() {
		return "MyProduct [id=" + id + ", name=" + name + "]";
	}

	public MyProduct() {
		super();
	}

	public MyProduct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
