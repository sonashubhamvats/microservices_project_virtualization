package com.example.employee.empDemo.controller;

import com.example.employee.empDemo.VO.ResponseTemplateVO;
import com.example.employee.empDemo.entity.Employee;
import com.example.employee.empDemo.service.empServiceClass;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/employee")
public class empController {
    @Autowired
    private empServiceClass empsClass;

    @PostMapping("/saveEmp")
    public Employee saveEmployee(@RequestBody Employee emp)
    {
        log.info("Inside save emp controller");
        return empsClass.saveEmployee(emp);
    }

    @GetMapping("/get/{id}")
    public Employee findEmpByID(@PathVariable("id") Long empID)
    {
        log.info("Inside get school controller");
        return empsClass.findEmpByID(empID);
    }

    @GetMapping("/getSch/{id}")
    public ResponseTemplateVO findEmpWithDepartmentID(@PathVariable("id") Long empID)
    {
        log.info("Inside get school controller");
        return empsClass.findEmpWithDepartmentID(empID);
    }
}
