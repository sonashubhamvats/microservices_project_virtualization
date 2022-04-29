package com.example.employee.empDemo.repository;

import com.example.employee.empDemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRepository extends JpaRepository<Employee,Long> {
    Employee findByEmpID(Long EmpID);
}
