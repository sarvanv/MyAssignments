package org.student;

public class Students 
{
	public void getStudentInfo(int id) 
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) 
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email,double phone) 
	{
		System.out.println(email);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Students students = new Students();
		System.out.println("--Studentid--");
		students.getStudentInfo(613);
		System.out.println("--Studentid & Name--");
		students.getStudentInfo(613, "Saravanan");
		System.out.println("--Email & Phone--");
		students.getStudentInfo("sarvanv@gmail.com", 998949);

	}
}
