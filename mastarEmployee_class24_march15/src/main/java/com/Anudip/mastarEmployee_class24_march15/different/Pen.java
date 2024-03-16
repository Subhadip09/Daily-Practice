package com.Anudip.mastarEmployee_class24_march15.different;

import javax.persistence.Entity;

@Entity
public class Pen extends MyProduct{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Pen() {
		super();
	}

	public Pen(String color) {
		super();
		this.color = color;
	}
}
