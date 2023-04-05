package com.profile.repository;

import java.util.List;
import com.profile.domain.Question;


public interface QuestionRepository {
	List<Question> findAll();
}
