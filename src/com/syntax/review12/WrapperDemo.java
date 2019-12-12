package com.syntax.review12;

import java.util.*;

public class WrapperDemo {

	public static void main(String[] args) {
		// int -> Integer
		// double -> Double
		// boolean -> Boolean

		// Boxing
		Integer i1 = new Integer(3);

		// auto-boxing
		Integer i2 = 5;

		// unboxing
		int primitiveInt1 = i1.intValue();

		// auto-unboxing
		int primitiveInt2 = i1;

		List<Integer> integers = new LinkedList<>();
		// integers.add("Bla bla");
		integers.add(new Integer(5));
		integers.add(4);
		integers.add(5);
		integers.add(2);
		
//		integers.remove(1);
		System.out.println(integers.size());
		
		System.out.println("--- LIST Example ---");

		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			//auto unboxing
			int el = iterator.next();
			System.out.println(el);
		}
		
		
		System.out.println("--- SET Example ---");
		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(5);
		integerSet.add(4);
		integerSet.add(5);
		integerSet.add(2);
		
		//There is no index in SET
//		integerSet.remove(4);
		
		Iterator<Integer> iteratorSet = integerSet.iterator();
		while (iteratorSet.hasNext()) {
			//auto unboxing
			int el = iteratorSet.next();
			System.out.println(el);
		}
	}

}
