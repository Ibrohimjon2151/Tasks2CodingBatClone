package com.example.tasks2codingbatclone.entity;

import com.example.tasks2codingbatclone.entity.template.AbcEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class LanguageCategory extends AbcEntity {

}
