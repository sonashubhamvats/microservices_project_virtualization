package com.example.school.demo.service;

import com.example.school.demo.entity.School;
import com.example.school.demo.repository.schoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class schoolServiceClass {
    @Autowired
    private schoolRepository schoolRepo;


    public School saveSchool(School school) {
        return schoolRepo.save(school);
    }

    public School findSchoolByID(Long schoolID) {
        return schoolRepo.findBySchoolID(schoolID);
    }
}
