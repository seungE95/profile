package com.profile.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.profile.domain.Question;
import com.profile.repository.QuestionRepository;

@Transactional
public class QuestionServiceImpl implements QuestionService{

	private final QuestionRepository questionRepository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	@Override
	public List<Question> findQuestion() {
		return questionRepository.findAll();
	}

}
