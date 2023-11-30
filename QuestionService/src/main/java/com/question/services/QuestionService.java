package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> get();
    Question getOne(long id);
    List<Question> getQuestionsOfQuiz(Long quizId);


}
