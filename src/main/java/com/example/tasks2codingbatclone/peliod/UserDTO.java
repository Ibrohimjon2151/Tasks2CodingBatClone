package com.example.tasks2codingbatclone.peliod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String password;
    private int starsId;
    private int LanguageCategoryId;
}
