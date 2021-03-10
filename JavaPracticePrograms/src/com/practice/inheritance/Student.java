package com.practice.inheritance;

public class Student extends Person{
	int marks = 78;
	String subject = "Mathematics";
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();
		System.out.println("Name of the Student: " + s1.name);
		System.out.println("Name of the Student: " + s1.age);
		System.out.println("Name of the Student: " + s1.city);
		System.out.println("Name of the Student: " + s1.subject);
		System.out.println("Name of the Student: " + s1.marks);
		
	}
}
