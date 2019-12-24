package com.syntax.review14;

import java.util.*;

public class ListOfMaps {

	public static void main(String[] args) {

		List<Map<String, String>> ListOfMaps = createListOfMaps();

		for (Map<String, String> element : ListOfMaps) {
//			System.out.println(element);

			String country = element.get("Country");
			System.out.println(country);

			if (country.equals("Italy")) {
				System.out.println(element);
			} else {
				System.out.println("The country is not Italy");
			}

			System.out.println("---End of each map---");

		}
	}

	public static List<Map<String, String>> createListOfMaps() {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();

		Map<String, String> map1 = createMap1();
		list.add(map1);
		list.add(createMap2());
		list.add(createMap3());

		return list;
	}

	public static Map<String, String> createMap1() {
		Map<String, String> map = new HashMap<>();
		map.put("Company", "Ernst Handel");
		map.put("Contact", "Roland Mendel");
		map.put("Country", "Austria");

		return map;
	}

	public static Map<String, String> createMap2() {
		Map<String, String> map = new HashMap<>();
		map.put("Company", "Island Trading");
		map.put("Contact", "Helen Bennett");
		map.put("Country", "UK");

		return map;
	}

	public static Map<String, String> createMap3() {
		Map<String, String> map = new HashMap<>();
		map.put("Company", "Magazzini Alimentari Riuniti");
		map.put("Contact", "Giovanni Rovelli");
		map.put("Country", "Italy");

		return map;
	}

}
