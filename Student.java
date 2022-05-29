package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Inside student name of Student");
	} 
	public void studentId() {
		System.out.println("Inside id of student class");

	}
	public void studentDept() {
		System.out.println("Inside dept of Student class");
	}
	
	public static void main(String[] args) {
		Student objStud = new Student();
		objStud.collegeCode();
		objStud.collegeName();
		objStud.collegeRank();
		objStud.deptName();
		objStud.studentName();
		objStud.studentId();
		objStud.studentDept();

	}

}
