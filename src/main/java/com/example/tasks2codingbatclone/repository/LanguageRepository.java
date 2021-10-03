package com.example.tasks2codingbatclone.repository;

import com.example.tasks2codingbatclone.entity.LanguageCategory;
import com.example.tasks2codingbatclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<LanguageCategory, Integer> {

}
