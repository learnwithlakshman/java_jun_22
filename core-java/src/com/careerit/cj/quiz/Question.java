package com.careerit.cj.quiz;

import java.util.List;

public class Question {

		private int qid;
		private String qData;
		private List<String> answers;
		private int answer;
		
		public Question(int qid, String qData, List<String> answers, int answer) {
			super();
			this.qid = qid;
			this.qData = qData;
			this.answers = answers;
			this.answer = answer;
		}
		public int getQid() {
			return qid;
		}
		public void setQid(int qid) {
			this.qid = qid;
		}
		public String getqData() {
			return qData;
		}
		public void setqData(String qData) {
			this.qData = qData;
		}
		public List<String> getAnswers() {
			return answers;
		}
		public void setAnswers(List<String> answers) {
			this.answers = answers;
		}
		public int getAnswer() {
			return answer;
		}
		public void setAnswer(int answer) {
			this.answer = answer;
		}
		
}
