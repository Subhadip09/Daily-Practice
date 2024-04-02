package com.Subhadip.Course_Monitoring_System.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	@Id
	private int batchId;
	
	private int courseId;
	
	private int facultyId;
	
	private int noOfStudents;
	
	private String batchStartDate;
	
	private String duration;

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, int courseId, int facultyId, int noOfStudents, String batchStartDate, String duration) {
		super();
		this.batchId = batchId;
		this.courseId = courseId;
		this.facultyId = facultyId;
		this.noOfStudents = noOfStudents;
		this.batchStartDate = batchStartDate;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", facultyId=" + facultyId + ", noOfStudents="
				+ noOfStudents + ", batchStartDate=" + batchStartDate + ", duration=" + duration + "]";
	}
}
