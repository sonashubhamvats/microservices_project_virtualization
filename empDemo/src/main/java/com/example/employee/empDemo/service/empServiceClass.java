package com.example.employee.empDemo.service;

import com.example.employee.empDemo.VO.ResponseTemplateVO;
import com.example.employee.empDemo.VO.School;
import com.example.employee.empDemo.entity.Employee;
import com.example.employee.empDemo.repository.empRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class empServiceClass {
    @Autowired
    private empRepository empRepo;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    public Employee findEmpByID(Long empID) {
        return empRepo.findByEmpID(empID);
    }

    public ResponseTemplateVO findEmpWithDepartmentID(Long empID) {
        ResponseTemplateVO re=new ResponseTemplateVO();
        Employee emp=empRepo.findByEmpID(empID);
        School school=restTemplate.getForObject(
                "http://SCHOOL-SERVICE/school/get/"+emp.getSchoolID(),School.class
        );
        re.setEmployee(emp);
        re.setSchool(school);
        return re;
    }
}
