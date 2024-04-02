package com.Subhadip.Course_Monitoring_System.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private int courseId;
	
	private String courseName;
	
	private String courseFee;
	
	private String courseDescription;
	
	//@OneToMany(cascade = CascadeType.ALL)
	private Batch batch;

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Course() {
		super();
	}

	public Course(int courseId, String courseName, String courseFee, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", courseDescription=" + courseDescription + "]";
	}
}
