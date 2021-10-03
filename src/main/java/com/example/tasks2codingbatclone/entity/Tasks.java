package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data

public class Tasks extends AbcEntity {

    @ManyToOne
    private TasksCategory tasksCategory;

    @OneToOne
    private Answers answers;
}
