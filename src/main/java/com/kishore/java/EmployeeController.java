package com.kishore.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public Employee getEmployee() {
        return new Employee(1, "Kishore", "Developer");
    }
}
