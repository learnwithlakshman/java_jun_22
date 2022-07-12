package com.careerit.cj.day22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Krish", 23);
		map.put("Manoj", 38);
		map.put("Charan", 25);
		map.put("Krish", 25);

		if (map.get("Manoj") == null) {
			map.put("Manoj",  1);
		}
		System.out.println(map);

		map.computeIfPresent("Manoj", (k, v) -> v + 1);
		map.computeIfAbsent("LN", (v)-> 1);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			Integer value = map.get(key);
			System.out.println(key+" "+value);
		}
		
		Collection<Integer> values = map.values();
		for(Integer value:values) {
			System.out.println(value);
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		map.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
		
	}
}
