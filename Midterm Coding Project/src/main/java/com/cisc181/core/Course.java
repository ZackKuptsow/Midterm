package com.cisc181.core;

import java.util.UUID;

public class Course {
	private static UUID CourseID;
	private String CourseName;
	private int GradePoints = 0;
	
	
	
	public Course() {
		super();
	}



	public Course(UUID courseID, String coursename, int gradePoints) {
		super();
		this.CourseID = courseID;
		this.CourseName = coursename;
		this.GradePoints = gradePoints;
	}



	public static UUID getCourseID() {
		return CourseID;
	}



	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}



	public String getCourseName() {
		return CourseName;
	}



	public void setCourseName(String coursename) {
		CourseName = coursename;
	}



	public int getGradePoints() {
		return GradePoints;
	}
	
	
	
}
