package com.Anudip.mastarEmployee_class24_march15.different;

import javax.persistence.Entity;

@Entity
public class Book extends MyProduct{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book() {
		super();
	}

	public Book(String name) {
		super();
		this.name = name;
	}
	
	
}
