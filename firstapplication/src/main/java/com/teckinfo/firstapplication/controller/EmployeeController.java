package com.teckinfo.firstapplication.controller;

import com.teckinfo.firstapplication.Employee;
import com.teckinfo.firstapplication.dto.EmployeeDto;
import com.teckinfo.firstapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;
@PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
     if(employeeService.addEmployee(employee) !=null ){
         return ResponseEntity.status(HttpStatus.CREATED).body("New Employee is created");
     } else{
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error creating new Employee");
     }
     //   Employee employee1= employeeService.addEmployee(employee);
     //   return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }


    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDto employeeDto){
           Employee employee1= employeeService.saveEmployee(employeeDto);
           return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

//    @PostMapping("/stringEmployee")
//    public ResponseEntity<String> stringEmployee(@RequestBody EmployeeString employeeString){
//        String student1=  employeeService.stringEmployee(employeeString);
//        return new ResponseEntity<>(student1,HttpStatus.CREATED);
//    }

//    @PostMapping("/employeeCheck")
//    public ResponseEntity<Boolean> employeeCheck(@RequestBody EmployeeBoolean employeeBoolean){
//        boolean present= employeeService.employeeCheck(employeeBoolean);
//        return  new ResponseEntity<Boolean>(present,HttpStatus.CREATED);
//    }
    @PostMapping("/addNewEmployeeList")
    public ResponseEntity<List<Employee>>  addListOfEmployees(@RequestBody List<Employee> employeeList){
         List<Employee> newEmployees= employeeService.addEmployeeList(employeeList);
         return new ResponseEntity<>(newEmployees,HttpStatus.CREATED);
    }
    @PostMapping("/newEmployeeList")
    public ResponseEntity<String> newEmployeesData(@RequestBody List<Employee> employeeList){
     String listOfEmployees = employeeService.multipleEmployeeList(employeeList);
     return new ResponseEntity<>(listOfEmployees,HttpStatus.CREATED);
    }
@PostMapping("/employeeUpdates")
    public ResponseEntity<Boolean> employeeUpdate(@RequestBody List<Employee> employeeList){
    boolean employees5 = employeeService.employeeAttedance(employeeList);
    return new ResponseEntity<>(employees5,HttpStatus.CREATED);
    }
    @PutMapping("/updateEmployee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
    Employee createEmployee=employeeService.updateOrCreateEmployee(employee);
    return new ResponseEntity<>(createEmployee,HttpStatus.CREATED);
    }
    @PutMapping("/updatingEmployee")
    public ResponseEntity<String> updatingEmployee(@RequestBody EmployeeDto employeeDto){
          String existingEmployee= employeeService.updateEmployee(employeeDto);
          return new ResponseEntity<>(existingEmployee,HttpStatus.CREATED);
    }
    @PutMapping("/employeeUpdatedStatus")
    public ResponseEntity<Boolean> checkingUpdatedEmployeeStatus(@RequestBody EmployeeDto employeeDto){
             boolean status =employeeService.updatedEmployeeSuccessfully(employeeDto);
             return new ResponseEntity<>(status,HttpStatus.CREATED);
    }
    
    @GetMapping("/allEmployees")
    public List<Employee> findallEmployees(){
    	return employeeService.getAllEmployees();
    }
    
    @GetMapping("{employeeById}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable String employeeById){
    	Employee employeeInfo = employeeService.getEmployeeById(employeeById);
    	if(employeeInfo != null) {
    		return new ResponseEntity<>(employeeInfo, HttpStatus.OK);
    	}else {
    		return new ResponseEntity<>(employeeInfo, HttpStatus.NOT_FOUND);
    	}

    	
    	
    }
}
