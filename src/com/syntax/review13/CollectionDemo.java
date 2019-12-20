package com.syntax.review13;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];

		Student student1 = new Student(1234, 18, "John Smith");
		studentArray[0] = student1;
		studentArray[1] = new Student(2345, 19, "James White");
		studentArray[2] = new Student(3456, 18, "Mary Lamb");
		// studentArray[3] = new Student(4567, 19, "Sasha Kallashnikov");

		// Create a new array with more size/space
		Student[] studentArrayNew = new Student[6];
		for (int i = 0; i < studentArray.length; i++) {
			studentArrayNew[i] = studentArray[i];
		}
		studentArrayNew[3] = new Student(4567, 19, "Sasha Kallashnikov");

		System.out.println("Same things done easier with a Collection");
		List<Student> studentList = new ArrayList<>();
		Student student2 = new Student(1234, 18, "John Smith");
		studentList.add(student2);
		studentList.add(new Student(2345, 18, "Adam Smith"));
		studentList.add(new Student(3456, 18, "Mary Lamb"));
		studentList.add(new Student(4567, 19, "Sasha Kallashnikov"));
		
		Student thirdStudent = new Student(6758, 18, "Gaukhar Koka");
		studentList.add(2, thirdStudent);
		
		
		// studentList.add(4);
		System.out.println(studentList.size());

		// This is called not type-safe
//		List l = new ArrayList<>();
//		l.add(student1);
//		l.add(3);
//		l.add("Sasha");

		System.out.println("---Using enhanced foor loop---");
		for (Student student : studentList) {
			student.displayInfo();
		}

		System.out.println("---Using iterator---");
		Iterator<Student> studentIterator = studentList.iterator();

		Student s1 = studentIterator.next();
		s1.displayInfo();
		Student s2 = studentIterator.next();
		s2.displayInfo();
		studentIterator.next().displayInfo();

		// I got another iterator
		Iterator<Student> studentIterator2 = studentList.iterator();

		if (studentIterator.hasNext()) {
			studentIterator.next().displayInfo();
		}

		if (studentIterator.hasNext()) {
			Student s5 = studentIterator.next();
		}
		
		System.out.println("---Using iterator 2---");
		while (studentIterator2.hasNext()) {
//			Student student = studentIterator2.next();
//			student.displayInfo();
			studentIterator2.next().displayInfo();
		}
		
//				LIST
//		ArrayList   LinkedList
//		
//				SET
//		HashSet 	LinkedHashSet		TreeSet

	}
}

class Student {
	int studentNumber;
	int age;
	String name;

	public Student(int studentNumber, int age, String name) {
		this.studentNumber = studentNumber;
		this.age = age;
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Student name " + name + " age " + age + " student number is " + studentNumber);
	}

}
