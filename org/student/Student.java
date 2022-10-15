package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student Name: Saravanan");
	}
	public void studentDept()
	{
		System.out.println("Student Department: Computer");
	}
	public void studentID()
	{
		System.out.println("Student ID: SSN613");
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		s.collegeName();   //calling grand parent class method
		s.collegeCode();   //calling grand parent class method
		s.collegeRank();  //calling grand parent class method
		s.deptName();    //calling parent class method
		s.studentName(); //calling local class method
		s.studentDept(); //calling local class method
		s.studentID(); //calling local class method
		Department d=new Department();
		d.collegeCode();  //calling parent class method
		d.collegeName();  //calling parent class method
		d.collegeRank();  //calling parent class method
		College c=new College();
		c.collegeCode(); //calling local class
		c.collegeName(); //calling local class
		c.collegeRank(); //calling local class
	}
}
