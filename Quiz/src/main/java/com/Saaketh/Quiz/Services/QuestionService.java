package com.Saaketh.Quiz.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Saaketh.Quiz.Models.Question;
import com.Saaketh.Quiz.Repositories.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionrepository;

	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionrepository.findAll();
	}

	public List<Question> getAllQuestionByCategory(String category) {
		// TODO Auto-generated method stub
		return questionrepository.findByCategory(category);
	}
	
	public Optional<Question> getAllQuestionById(Integer questionId) {
		// TODO Auto-generated method stub
		return questionrepository.findById(questionId);
	}

	public String addQuestion(Question question) {
		// TODO Auto-generated method stub
		questionrepository.save(question);
		return "success";
	}

	public String deleteById(Integer deleteId) {
		questionrepository.deleteById(deleteId);
		return "deleted successfully";
	}



}
