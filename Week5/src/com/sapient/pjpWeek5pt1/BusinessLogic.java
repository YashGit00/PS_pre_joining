package com.sapient.pjpWeek5pt1;

import java.util.ArrayList;
import java.util.Arrays;

public class BusinessLogic 
{
	public static Student[] s;
	public static Student readStudent()
	{
		Student student = new Student();
		System.out.println("Enter student details :");
		System.out.print("Enter name :");
		student.setName(ReaderClass.read.nextLine());
		System.out.print("\nEnter id :");
		student.setId(ReaderClass.read.nextInt());
		System.out.print("\nEnter city :");
		student.setCity(ReaderClass.read.nextLine());
		return student;
	}
	public static void displayStudent(Student s)
	{
		System.out.println(s.toString());
	}
	public static ArrayList<Student> StudentInSameCity(String city)
	{
		ArrayList<Student> sameCityStudents = new ArrayList();
		for (Student student : s) 
		{
			if ( student.getCity().equals(city)) sameCityStudents.add(student);
		}
		for (Student student : sameCityStudents) {
			System.out.println(student.toString());
		}
		return sameCityStudents;
	}
	public static void NamelySortedStudents()
	{
		Arrays.sort(s);
		for (Student student : s) {
			System.out.println(student);
		}
	}
	public static Student find(int id) {
		try {
			for (Student student : s) {
				if ( student.getId() == id)
				{
					displayStudent(student);
					return student;
				}
			}
			throw new Exception("Student not found");
		} catch (Exception e) 
		{
			System.out.println("Please add this student.\nThis student is not found in the list.");
			return null;
		}
	}
}
