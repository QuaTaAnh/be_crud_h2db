package com.example.be_crud_ca.controller;

import com.example.be_crud_ca.model.Employee;
import com.example.be_crud_ca.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    //Test
    @GetMapping("/")
    public String test(){
        return "xin chao";
    }

    //API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    //API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    //API delete employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return employeeService.deleteEmployee(id);
    }

    //API lay danh sach
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAllEmployee();
    }
}
