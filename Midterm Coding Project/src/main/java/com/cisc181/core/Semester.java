package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private static UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester() {
		super();
	}

	public Semester(UUID semesterID, Date startDate, Date endDate) {
		super();
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}

	public static UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
}
