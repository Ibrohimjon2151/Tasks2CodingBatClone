package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class TasksCategory extends AbcEntity {

    @ManyToOne
    private LanguageCategory languageCategory;

}
