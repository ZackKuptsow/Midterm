package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	ArrayList<Course> course = new ArrayList<Course>();
	ArrayList<Semester> semester = new ArrayList<Semester>();
	ArrayList<Section> section = new ArrayList<Section>();
	ArrayList<Student> student = new ArrayList<Student>();
	ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() {
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		Semester fall = new Semester();
		Semester spring = new Semester();
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		
		Section section1 = new Section();
		Section section2 = new Section();
		Section section3 = new Section();
		Section section4 = new Section();
		Section section5 = new Section();
		Section section6 = new Section();
		
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(section1);
		sections.add(section2);
		sections.add(section3);
		sections.add(section4);
		sections.add(section5);
		sections.add(section6);
		
		Student student1 = new Student(null, null, null, null, eMajor.CHEM, null, null, null);
		Student student2 = new Student(null, null, null, null, eMajor.NURSING, null, null, null);
		Student student3 = new Student(null, null, null, null, eMajor.COMPSI, null, null, null);
		Student student4 = new Student(null, null, null, null, eMajor.PHYSICS, null, null, null);
		Student student5 = new Student(null, null, null, null, eMajor.PHYSICS, null, null, null);
		Student student6 = new Student(null, null, null, null, eMajor.BUSINESS, null, null, null);
		Student student7 = new Student(null, null, null, null, eMajor.CHEM, null, null, null);
		Student student8 = new Student(null, null, null, null, eMajor.NURSING, null, null, null);
		Student student9 = new Student(null, null, null, null, eMajor.COMPSI, null, null, null);
		Student student10 = new Student(null, null, null, null, eMajor.CHEM, null, null, null);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		
	}

	@Test
	public void StudentTest() {
		for(int i = 0; i > student.size(); i++){
			for(int j =0; j > section.size(); j++){
				Enrollment enroll = new Enrollment(UUID.randomUUID(), UUID.randomUUID());
				enrollment.add(enrollment);
			}
			double sum = 0;
			double average = 0;
			
			for(Enrollment e : enrollment){
				e.setGrade(88.00);
			}
		}
		
		double average;
		for(Enrollment e : enrollment){
			double sum = e.getGrade();
			average = sum / 5;
		}
	assertEquals((88 * 5 / 5), average, 90);
	}
}