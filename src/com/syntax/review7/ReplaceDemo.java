package com.syntax.review7;

public class ReplaceDemo {
	public static void main(String[] args) {
		String longStr = "I Am very happy today, because today is not Monday.";
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace(',', ';');
		System.out.println(anotherStr);

		anotherStr = longStr.replace('a', 'e').replace('A', 'E');
		System.out.println(anotherStr);
		System.out.println("-----------------");

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		anotherStr = longStr.replace(",", "");
		System.out.println(anotherStr);
		System.out.println("-----------------");

		anotherStr = longStr.replaceAll("a", "e");
		System.out.println(anotherStr);

		anotherStr = longStr.replaceAll("today", "tomorrow");
		System.out.println(anotherStr);

		anotherStr = longStr.replaceAll("[aA]", "e");
		System.out.println(anotherStr);

		anotherStr = longStr.replaceAll("[a-zA-Z ,.]", "1");
		System.out.println(anotherStr);

		longStr = "!{}#%$#!@!{}";
		anotherStr = longStr.replaceAll("[!{}@#$%]", "");
		System.out.println(anotherStr);

		longStr = "my social security is 232-34-3423";
		anotherStr = longStr.replaceAll("[0-9]", "*");
		System.out.println(anotherStr);

		longStr = "I want to learn Java. And I want to learn more! Is this OK?";
		anotherStr = longStr.replaceAll("[^a-zA-Z]", "+");
		System.out.println(longStr);
		System.out.println(anotherStr);
		System.out.println("-----------------");

		longStr = "I Am very happy today, because today is not Monday.";
		anotherStr = longStr.replaceFirst("today", "tomorrow");
		System.out.println(longStr);
		System.out.println(anotherStr);
		
		System.out.println("---Index Of---");
		System.out.println(longStr);
		int result = longStr.indexOf("today", 32);
		System.out.println(result);
	}
}
