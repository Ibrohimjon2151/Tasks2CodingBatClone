package com.example.tasks2codingbatclone.repository;

import com.example.tasks2codingbatclone.entity.Tasks;
import com.example.tasks2codingbatclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {

}
