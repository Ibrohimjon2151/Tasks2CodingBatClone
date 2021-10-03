package com.example.tasks2codingbatclone.repository;

import com.example.tasks2codingbatclone.entity.TasksCategory;
import com.example.tasks2codingbatclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksCategoryRepository extends JpaRepository<TasksCategory, Integer> {

}
