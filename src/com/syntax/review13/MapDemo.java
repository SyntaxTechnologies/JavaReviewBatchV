package com.syntax.review13;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
//		List<Student> studentList = new ArrayList<>();
//		Student student2 = new Student(1234, 18, "John Smith");
//		studentList.add(student2);
//		studentList.add(new Student(2345, 18, "Adam Smith"));
//		studentList.add(new Student(3456, 18, "Mary Lamb"));
//		studentList.add(new Student(4567, 19, "Sasha Kallashnikov"));
//
//		Student thirdStudent = new Student(6758, 18, "Gaukhar Koka");
//		studentList.add(2, thirdStudent);
//
//		System.out.println(studentList);
//		// How do I print the student with number 3456
//		Iterator<Student> it = studentList.iterator();
//
//		while (it.hasNext()) {
//			Student student = it.next();
//			if (student.studentNumber == 3456) {
//				student.displayInfo();
//				break;
//			}
//		}

//				MAP
//		HashMap 	LinkedHashMap		TreeMap

		Map<Integer, Student> studentMap = new HashMap<>();
		Student student3 = new Student(1234, 18, "John Smith");
		studentMap.put(student3.studentNumber, student3);
		studentMap.put(2345, new Student(2345, 18, "Adam Smith"));
		studentMap.put(3456, new Student(3456, 18, "Mary Lamb"));
		studentMap.put(4567, new Student(4567, 19, "Sasha Kallashnikov"));

		System.out.println(studentMap);

//		studentMap.get(3456).displayInfo();
		Student studentFromMap = studentMap.get(3456);
		studentFromMap.displayInfo();

		System.out.println("---Getting Keys---");
		Set<Integer> keys = studentMap.keySet();
		Iterator<Integer> keyIterator = keys.iterator();

		while (keyIterator.hasNext()) {
			int key = keyIterator.next();
			Student student = studentMap.get(key);
			System.out.println(key + " --> " + student);
		}

		System.out.println("---Getting values---");
		Collection<Student> valueCollection = studentMap.values();
		Iterator<Student> studentIterator = valueCollection.iterator();

		while (studentIterator.hasNext()) {
			Student student = studentIterator.next();
//			System.out.println(student);
			student.displayInfo();
		}

		System.out.println("---Getting entries---");
		//One Entry is one pair. In our case, a pair of Integer and Student
		Set<Entry<Integer, Student>> entries = studentMap.entrySet();
//		System.out.println(entries);
		Iterator<Entry<Integer, Student>> entryIterator = entries.iterator();
//		Entry<Integer, Student>  firstPair = entryIterator.next();
//		System.out.println(firstPair);
		while(entryIterator.hasNext()) {
			Entry<Integer, Student> pair = entryIterator.next();
			Integer key = pair.getKey();
			Student student = pair.getValue();
			System.out.println(key + " --> " + student.toString());
		}

	}
}
