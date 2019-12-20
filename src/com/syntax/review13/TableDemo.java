package com.syntax.review13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TableDemo {

	public static void main(String[] args) {
		Map<String, String> map1 = createMap1();
		System.out.println(map1);

		Map<String, String> map2 = createMap2();
		System.out.println(map2);

		System.out.println("---List of Maps---");
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(createMap3());
		System.out.println(mapList);

		System.out.println("---Map Iterator---");
		Iterator<Map<String, String>> mapIterator = mapList.iterator();
		while (mapIterator.hasNext()) {
			Map<String, String> map = mapIterator.next();
//			System.out.println(map);
			System.out.println();
			Set<Entry<String, String>> mapEntries = map.entrySet();
			Iterator<Entry<String, String>> entryIterator = mapEntries.iterator();
			while (entryIterator.hasNext()) {
				Entry<String, String> entry = entryIterator.next();
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key + " -> " + value);
			}
		}
		
//		List<Map<String, String>> listOfMaps = createListOfMaps();

	}
	
	//Create a method that returns a List of Maps

	public static Map<String, String> createMap1() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Alfreds Futterkiste");
		map1.put("Contact", "Maria Anders");
		map1.put("Country", "Germany");
		return map1;
	}

	public static Map<String, String> createMap2() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Centro comercial Moctezuma");
		map1.put("Contact", "Francisco Chang");
		map1.put("Country", "Mexico");
		return map1;
	}

	public static Map<String, String> createMap3() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Ernst Handel");
		map1.put("Contact", "Roland Mendel");
		map1.put("Country", "Austria");
		return map1;
	}
}
