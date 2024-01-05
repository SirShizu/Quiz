package com.mahesh.Quiz.controller;

import com.mahesh.Quiz.entity.Quiz;
import com.mahesh.Quiz.repo.QuizRepo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("*")
@RequestMapping("/quizzes")
public class QuizController {

    @Autowired
    QuizRepo QuizRepository;
    
    @GetMapping    
    public List<Quiz> getAllTopics() {
        return QuizRepository.findAll();
    }
    
}
