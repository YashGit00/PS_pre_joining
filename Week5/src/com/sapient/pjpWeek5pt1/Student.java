package com.sapient.pjpWeek5pt1;

public class Student implements Comparable<Student>
{
	int id;
	String name, city;
	public Student()
	{
		id = (Integer) null;
		name = city = null;
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Student o) {
		return o.getName().compareTo(this.name);
	}	
	
}
