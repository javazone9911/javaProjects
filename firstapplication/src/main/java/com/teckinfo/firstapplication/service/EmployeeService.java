package com.teckinfo.firstapplication.service;

import com.teckinfo.firstapplication.Employee;
import com.teckinfo.firstapplication.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee saveEmployee(EmployeeDto employeeDto);
  //  public String stringEmployee(EmployeeDto employeeString);
  //  public boolean employeeCheck(EmployeeDto employeeBoolean);

    public List<Employee> addEmployeeList(List<Employee> employeeList);
    public String multipleEmployeeList(List<Employee> employeeList2);
    public boolean employeeAttedance(List<Employee> employeeList3);
    public Employee updateOrCreateEmployee(Employee employee);
    public String updateEmployee(EmployeeDto employeeDto);
    public boolean updatedEmployeeSuccessfully(EmployeeDto employeeDto);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(String id);
    
}


