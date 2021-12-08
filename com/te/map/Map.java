package com.te.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "chandu");
		hashMap.put(102, "sam");
		hashMap.put(103, "mc");
		hashMap.put(104, "varun");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> s : entrySet) {
			System.out.println(s);
		}
	}
}
