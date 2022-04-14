package com.careerit.cj.day22;

import java.util.List;

public class QuestionDetails {

		private int qid;
		private String question;
		private List<String> options;
		private int answer;
		
		public QuestionDetails(int qid, String question, List<String> options, int answer) {
			super();
			this.qid = qid;
			this.question = question;
			this.options = options;
			this.answer = answer;
		}
		public int getQid() {
			return qid;
		}
		public void setQid(int qid) {
			this.qid = qid;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public int getAnswer() {
			return answer;
		}
		public void setAnswer(int answer) {
			this.answer = answer;
		}
		
		
		
}
