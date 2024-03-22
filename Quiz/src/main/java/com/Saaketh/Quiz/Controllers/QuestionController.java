package com.Saaketh.Quiz.Controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Saaketh.Quiz.Models.Question;
import com.Saaketh.Quiz.Services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionservice;
	
	@GetMapping("/giveall")
	public List<Question> getAllQuestions() {
		return questionservice.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public List<Question> getAllQuestionByCategory(@PathVariable String category) {
		return questionservice.getAllQuestionByCategory(category);
	
	}
	
	@GetMapping("/QuestionId/{questionId}")
	public Optional<Question> getAllQuestionById(@PathVariable Integer questionId) {
		return questionservice.getAllQuestionById(questionId);
	
	}
	
	@PostMapping("/add")
	public String addQuestion(Question question) {
		return questionservice.addQuestion(question);
	}
	
	@DeleteMapping("/delete/{deleteId}")
	public String deleteQuestion(@PathVariable Integer deleteId) {
		questionservice.deleteById(deleteId);
		return "successfull";
	}
}