package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sample {
	public static void main(String args[]) {
		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		for (String str : Arrays.asList("String4", "String5", "String6", "String3", "String2", "String2")) {
			hashSet.add(str);
			linkedHashSet.add(str);
			treeSet.add(str);

			hashMap.put(Integer.parseInt(str.substring(6)), str);
			linkedHashMap.put(Integer.parseInt(str.substring(6)), str);
			treeMap.put(Integer.parseInt(str.substring(6)), str);
		}
		
		hashMap.put(1, "String7");
		linkedHashMap.put(1, "String7");
		treeMap.put(1, "String7");
		
		hashMap.put(8, "String7");
		linkedHashMap.put(8, "String7");
		treeMap.put(8, "String7");
		
		hashMap.put(1, "String9");
		linkedHashMap.put(1, "String9");
		treeMap.put(1, "String9");

		System.out.println("------------ HashSet ------------");
		Iterator<String> itr1 = hashSet.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("------------ LinkedHashSet ------------");
		Iterator<String> itr2 = linkedHashSet.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("------------ TreeSet ------------");
		Iterator<String> itr3 = treeSet.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println("------------ HashMap ------------");
		hashMap.forEach((k, v)-> {
			System.out.println(k+" - "+v);
		});
		
		System.out.println("------------ LinkedHashMap ------------");
		linkedHashMap.forEach((k, v)-> {
			System.out.println(k+" - "+v);
		});

		System.out.println("------------ TreeMap ------------");
		treeMap.forEach((k, v)-> {
			System.out.println(k+" - "+v);
		});
	}
}
