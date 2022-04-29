package com.example.school.demo.controller;

import com.example.school.demo.entity.School;
import com.example.school.demo.service.schoolServiceClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/school")
public class schoolController {
    @Autowired
    private schoolServiceClass ssClass;

    @PostMapping("/saveSchool")
    public School saveSchool(@RequestBody School school)
    {
        log.info("Inside save school controller");
        return ssClass.saveSchool(school);
    }

    @GetMapping("/get/{id}")
    public School findSchoolByID(@PathVariable("id") Long schoolID)
    {
        log.info("Inside get school controller");
        return ssClass.findSchoolByID(schoolID);
    }
}
