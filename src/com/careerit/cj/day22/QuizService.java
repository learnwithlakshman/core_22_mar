package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

		private List<QuestionDetails> questionDetailsList;
		


		public QuizService() {
			questionDetailsList = QuizReaderUtil.loadQuestionFromTextFile();
		}
		
		public void startQuiz() throws InterruptedException {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter your name :");
				String name = sc.nextLine();
				System.out.println("Hi "+name);
				System.out.println("\nYour quiz is going start in few seconds");
				TimeUnit.SECONDS.sleep(5);
				
				List<Integer> correctAnswerList = new ArrayList<>();
				List<Integer> userAnswerList = new ArrayList<>();
				
				for(QuestionDetails q:questionDetailsList) {
					System.out.println(q.getQid()+". " +q.getQuestion());
					for(int i=0;i<q.getOptions().size();i++) {
						System.out.println((i+1)+". "+q.getOptions().get(i));
					}
					correctAnswerList.add(q.getAnswer());
					System.out.println("Enter your answer (1-4) only");
					int ch = sc.nextInt();
					userAnswerList.add(ch);
				}
				System.out.println("Thank you for taking quiz, we will show result very soon please wait....");
				TimeUnit.SECONDS.sleep(2);
				showResult(name,correctAnswerList,userAnswerList);
				sc.close();
		}

		private void showResult(String name, List<Integer> correctAnswerList, List<Integer> userAnswerList) {
			
				int count = correctAnswerList.size();
				int ccount = 0;
				for(int i=0;i<correctAnswerList.size();i++) {
					if(correctAnswerList.get(i)== userAnswerList.get(i)) {
						ccount++;
					}
				}
				float score=ccount/(float)count * 100;
				String result = score > 50 ? "PASS" : "FAIL";
				System.out.println("--------------- Result -----------------");
				System.out.println("Name                  :"+name);
				System.out.println("Total Questions       :"+count);
				System.out.println("No of Correct answers :"+ccount);
				System.out.println("No of Wrong answers   :"+(count-ccount));
				System.out.println("Result                :"+result);
					
				
		}
		
		
		
}
