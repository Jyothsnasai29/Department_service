package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department dept)
    {
        log.info("Saving the department " + dept);
        return departmentService.saveDepartment(dept);
    }

    @GetMapping("/findBy/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId)
    {
        log.info("Find department by ID");
        return departmentService.getDepartmentById(departmentId);
    }

}
