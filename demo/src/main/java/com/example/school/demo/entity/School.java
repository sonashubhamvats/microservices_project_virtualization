package com.example.school.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  schoolID;
    private String schoolName;
    private String schoolAddress;
    private String schoolCode;
}
