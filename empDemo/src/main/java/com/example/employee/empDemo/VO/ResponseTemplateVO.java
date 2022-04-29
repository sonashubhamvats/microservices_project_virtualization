package com.example.employee.empDemo.VO;

import com.example.employee.empDemo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private School school;
    private Employee employee;
}
