package com.careerit.cj.quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

		private List<Question> questions;
		private Map<Integer,Integer> answerMap;
		public QuizService() {
			questions = FileReaderUtil.loadFromFile(false);
			answerMap = new HashMap<>();
			for(Question q:questions) {
				answerMap.put(q.getQid(),q.getAnswer());
			}
		}
		public void start() {
			System.out.println("Please wait quiz is going start.....");
			try {
				TimeUnit.SECONDS.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			Scanner sc = new Scanner(System.in);
			Map<Integer,Integer> userAnswerMap = new HashMap<Integer, Integer>();
			int c = 1;
			for(Question question:questions) {
				System.out.println("#"+c+++". "+question.getqData());
				int i=1;
				System.out.println();
				for(String option:question.getAnswers()) {
					System.out.println(i+". "+option);
					i++;
				}
				System.out.println();
				System.out.println("Enter your answer : ");
				int userAnswer = sc.nextInt();
				userAnswerMap.put(question.getQid(),userAnswer);
			}
			sc.close();
			System.out.println("Please wait results are computing.....");
			try {
				TimeUnit.SECONDS.sleep(10);
				computeResult(userAnswerMap);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
		}
		private void computeResult(Map<Integer, Integer> userAnswerMap) {
			
				int ccount = 0;
				for(Map.Entry<Integer, Integer> entery:userAnswerMap.entrySet()) {
					if(answerMap.get(entery.getKey())==entery.getValue()) {
						ccount++;
					}
				}
				int wcount = answerMap.size()-ccount;
				System.out.println("Total Question  :"+answerMap.size());
				System.out.println("Correct Answers :"+ccount);
				// Result
			
		}
}
