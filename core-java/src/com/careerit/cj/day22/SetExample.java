package com.careerit.cj.day22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

		public static void main(String[] args) {
			
			Set<String> names = new HashSet<>();
			names.add("Krish");
			names.add("Manoj");
			names.add("Krish");
			names.add("Rajesh");
			
			System.out.println(names.size());
			System.out.println(names);
			
			for(String name:names) {
				System.out.println(name);
			}
			
			Iterator<String> itr = names.iterator();
			while(itr.hasNext()) {
				String name = itr.next();
				System.out.println(name);
			}
			
			//
			names.stream().forEach(ele->{
				System.out.println(ele);
			});
			
		}
}
