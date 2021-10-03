package com.example.tasks2codingbatclone.repository;

import com.example.tasks2codingbatclone.entity.Answers;
import com.example.tasks2codingbatclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswersRepository extends JpaRepository<Answers, Integer> {

}
