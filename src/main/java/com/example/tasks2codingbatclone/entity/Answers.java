package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Answers extends AbcEntity {
    @OneToOne
    private Tasks tasks;
}
