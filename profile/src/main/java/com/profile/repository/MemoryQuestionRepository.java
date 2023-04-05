package com.profile.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.profile.domain.Question;

@Repository
public class MemoryQuestionRepository implements QuestionRepository{

	private final Map<Long, Question> store = new HashMap<>();
	
	@Override
	public List<Question> findAll() {
		return new ArrayList<>(store.values());
	}

	public void clearStore() {
		store.clear();
	}
}
