package com.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.profile.domain.Question;
import com.profile.service.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	
	@GetMapping("/question")
	public String qusetion(Model model) {
		List<Question> list = questionService.findQuestion();
		model.addAttribute("list",list);
		System.out.println(list.toString());
		return "question";
	}
}
