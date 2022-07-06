package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(1001);
			list.add(1005);
			list.add(1009);
			list.add(1004);
			list.add(1008);
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("-------using for each --------");
			for(Integer ele:list) {
				System.out.println(ele);
			}
			
			list.remove(1);
			System.out.println(list);
			list.add(1, 1010);
			System.out.println(list);
			System.out.println(list.subList(2, 5));
			
			List<Integer> evenList = new ArrayList<Integer>();
			evenList.add(1020);
			evenList.add(1022);
			evenList.add(1024);
			
			list.addAll(evenList);
			System.out.println(list);
			
			list.removeAll(evenList);
			System.out.println(list);
			
		}
}
