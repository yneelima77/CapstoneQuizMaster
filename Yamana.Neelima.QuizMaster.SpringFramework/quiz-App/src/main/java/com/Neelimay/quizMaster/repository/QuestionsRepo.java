package com.Neelimay.quizMaster.repository;

import com.Neelimay.quizMaster.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Long> {

}
