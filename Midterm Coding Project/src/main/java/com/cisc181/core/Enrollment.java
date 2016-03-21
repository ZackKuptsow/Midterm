package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID = Section.getSectionID();
	private UUID StudentID = Student.getStudentID();
	private UUID EnrollmentID;
	private double Grade = 0;
	
	private Enrollment() {
		super();
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = this.enrollmentID;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
