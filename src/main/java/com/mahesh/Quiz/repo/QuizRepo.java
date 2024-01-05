package com.mahesh.Quiz.repo;

import com.mahesh.Quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long>{
    
}
