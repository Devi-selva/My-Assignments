package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student name is Devi");
	}

	public void studentDept()
	{
		System.out.println("Student Dept is ECE");
	}
	public void studentId()
	{
		System.out.println("Student Id is 004");
	}
	
	public static void main(String[] args) {
		
		Student st= new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentName();
		st.studentId();
	}
}
