package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //get All
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    //get one
    @GetMapping("/{id}")
    public Quiz get(@PathVariable  long id){
        return quizService.get(id);
    }

}
