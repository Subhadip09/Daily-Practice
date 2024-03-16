package com.Anudip.mastarEmployee_class24_march15;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carId;
	
	private String carName;
	
	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Car() {
		super();
	}

	public Car(int carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}
	
	
}
