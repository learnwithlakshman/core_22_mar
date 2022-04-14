package com.careerit.cj.day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class QuizReaderUtil {

	
		public static List<QuestionDetails> loadQuestionFromTextFile(){
			String filePath="data/quiz.txt";
			List<QuestionDetails> 	qlist = new ArrayList<QuestionDetails>();
			try {
				List<String> list = Files.readAllLines(Paths.get(filePath));
				for(int i=0;i<list.size();) {
					int j=i+7;
					List<String> sublist = list.subList(i, j);
					i=j;
					int qid = Integer.parseInt(sublist.get(0).substring(1,sublist.get(0).length()));
					String question = sublist.get(1);
					List<String> options=new ArrayList<String>();
					options.add(sublist.get(2));
					options.add(sublist.get(3));
					options.add(sublist.get(4));
					options.add(sublist.get(5));
					int answer = Integer.parseInt(sublist.get(6).split(":")[1]);
					
					QuestionDetails q = new QuestionDetails(qid,question,options,answer);
					qlist.add(q);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return qlist;
		}
		
}
