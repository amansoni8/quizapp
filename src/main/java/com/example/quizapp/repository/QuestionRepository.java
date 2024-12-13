package com.example.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quizapp.entity.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
  
}

