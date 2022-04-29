package com.example.employee.empDemo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private Long  schoolID;
    private String schoolName;
    private String schoolAddress;
    private String schoolCode;
}
