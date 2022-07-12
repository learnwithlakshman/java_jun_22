package com.careerit.cj.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReaderUtil {

	private FileReaderUtil() {

	}

	public static List<Question> loadFromFile(boolean isShuffle) {
		List<Question> list = new ArrayList<Question>();
		try {
			List<String> data = Files.readAllLines(Path.of("quiz.txt"));
			for(int i=0;i<data.size();) {
				List<String> questiondata = data.subList(i, i+7);
				i = i + 7;
				int qId = Integer.parseInt(questiondata.get(0).replace("#", ""));
				String qData = questiondata.get(1);
				List<String> answers = new ArrayList<String>();
				answers.add(questiondata.get(2));
				answers.add(questiondata.get(3));
				answers.add(questiondata.get(4));
				answers.add(questiondata.get(5));
				int answer = Integer.parseInt(questiondata.get(6).split(":")[1]);
				Question question = new Question(qId, qData, answers, answer);
				list.add(question);
				
			}
			if(isShuffle)
				Collections.shuffle(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
