package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
public class User extends AbcEntity {
    private String password;

    @OneToOne
    private Stars stars;

    @ManyToOne
    private LanguageCategory languageCategory;


}
