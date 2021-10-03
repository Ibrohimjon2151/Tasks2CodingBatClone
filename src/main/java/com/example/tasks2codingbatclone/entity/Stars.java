package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Stars extends AbcEntity {
    private int amount;
}
