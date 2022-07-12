package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class CountWords {

	public static void main(String[] args) {

			List<String> list = randomNames(20);
			System.out.println(list);
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			for(String name:list) {
				if(map.get(name)==null) {
					map.put(name, 1);
				}else {
					map.put(name,map.get(name)+1);
				}
			}
			System.out.println(map);
			System.out.println(map.keySet());
			
			// Unique name
			// Each name occurance
			
			
			
			
	}

	
	
	
	
	
	
	
	private static List<String> randomNames(int num) {
		String data = "Java,.Net,Python,C,CPP,DevOps,AWS,PHP,MySQL,BigData";
		List<String> list = new ArrayList<>();
		String[] arr = data.split(",");
		while (list.size() <= num) {
			String name = arr[ThreadLocalRandom.current().nextInt(0, arr.length)];
			list.add(name);
		}
		return list;

	}
}
