package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generate20Numbers {

		public static void main(String[] args) {
			
				// Question Bank - 500 ( 1 - 500 )
			
				// Randomly 50 questions
			
				List<Integer> questionBank = IntStream.range(1, 501)
						                              .boxed()
						                              .collect(Collectors.toList());
				
				/*
				 * List<Integer> list = new ArrayList<Integer>(); for(int i=1;i<=500;i++) {
				 * list.add(i); }
				 */
				 
				Set<Integer> questionsSet = new HashSet<>();
				while(questionsSet.size()<50) {
					int num = ThreadLocalRandom.current().nextInt(1, questionBank.size());
					questionsSet.add(questionBank.get(num));
				}
				
				System.out.println(questionsSet.size());
				
				
				
				
		}
}
