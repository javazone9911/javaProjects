package com.teckinfo.firstapplication.service;

import com.google.gson.Gson;
import com.teckinfo.firstapplication.Employee;
import com.teckinfo.firstapplication.dto.EmployeeDto;
import com.teckinfo.firstapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		try {
			employee.setCreatedBy("system");
			employee.setCreatedOn(new Date());
			employee.setCreatedSource("addEmployee()");
			employee.setUpdatedBy("");
			employee.setUpdatedOn(new Date());
			employee.setUpdatedSource("");
			// Long randomEmployeeId=generateRandomId();
			// employee.setEmployeeId( randomEmployeeId);
			employeeRepository.save(employee);
			return employee;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Employee saveEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setAge(employeeDto.getAge());
		employee.setSalary(employeeDto.getSalary());
		employee.setEmail(employeeDto.getEmail());
		employee.setCreatedBy("system");
		employee.setCreatedOn(new Date());
		employee.setCreatedSource("addEmployee()");
		employee.setUpdatedBy("");
		employee.setUpdatedOn(new Date());
		employee.setUpdatedSource("");
		// String randomId = generateRandomId();
		// employee.setEmployeeId(randomId);
		return employeeRepository.save(employee);
	}

//    @Override
//    public String stringEmployee(EmployeeString employeeString) {
//        Employee student=new Employee();
//        student.setFirstName(employeeString.getFirstName());
//        student.setLastName(employeeString.getLastName());
//        student.setEmail(employeeString.getEmail());
//        student.setAge(employeeString.getAge());
//        student.setSalary(employeeString.getSalary());
//        student.setJobTitle(employeeString.getJobTitle());
//        student.setCreatedBy("system");
//        student.setCreatedOn(new Date());
//        student.setCreatedSource("addEmployee()");
//        student.setUpdatedBy("");
//        student.setUpdatedOn(new Date());
//        student.setUpdatedSource("");
//       if(employeeRepository.save(student) != null){
//           return "The new Employee is executed successfully";
//       } else {
//           return "error in code executing";
//       }
//
//    }

//    @Override
//    public boolean employeeCheck(EmployeeBoolean employeeBoolean) {
//        Employee checking=new Employee();
//        checking.setFirstName(employeeBoolean.getFirstName());
//        checking.setLastName(employeeBoolean.getLastName());
//        checking.setJobTitle(employeeBoolean.getJobTitle());
//        checking.setAge(employeeBoolean.getAge());
//        checking.setEmail(employeeBoolean.getEmail());
//        checking.setSalary(employeeBoolean.getSalary());
//        checking.setCreatedBy("system");
//        checking.setCreatedOn(new Date());
//        checking.setCreatedSource("addEmployee()");
//        checking.setUpdatedBy("");
//        checking.setUpdatedOn(new Date());
//        checking.setUpdatedSource("");
//        if(employeeRepository.save(checking) != null) {
//            return true;
//        } else
//        return false;
//    }

	@Override
	public List<Employee> addEmployeeList(List<Employee> employeeList) {
		List<Employee> addListOfEmployees = new ArrayList<>();
		for (Employee employee : employeeList) {
			employee.setCreatedBy("oracle");
			employee.setCreatedOn(new Date());
			employee.setCreatedSource("addEmployeeList()");
			employee.setUpdatedBy("");
			employee.setUpdatedOn(new Date());
			employee.setUpdatedSource("");
			addListOfEmployees.add(employee);
		}
		return employeeRepository.saveAll(addListOfEmployees);
	}

	@Override
	public String multipleEmployeeList(List<Employee> employeeList2) {
		List<Employee> creatingMultipleList = new ArrayList<>();
		for (Employee employeeString : employeeList2) {
			employeeString.setCreatedBy("oracle");
			employeeString.setCreatedOn(new Date());
			employeeString.setCreatedSource("addEmployeeList()");
			employeeString.setUpdatedBy("");
			employeeString.setUpdatedOn(new Date());
			employeeString.setUpdatedSource("");
			// Long randomId = generateRandomId();
			// employeeString.setEmployeeId(randomId);
			creatingMultipleList.add(employeeString);
		}
		try {
			employeeRepository.saveAll(creatingMultipleList);
			return "Employee save successfully";
		} catch (Exception e) {
			return "failured to saved employee";
		}
	}

	@Override
	public boolean employeeAttedance(List<Employee> employeeList3) {
		List<Employee> checkingEmployeeInfo = new ArrayList<>();
		for (Employee info : employeeList3) {
			info.setCreatedBy("oracle");
			info.setCreatedOn(new Date());
			info.setCreatedSource("addEmployeeList()");
			checkingEmployeeInfo.add(info);
		}
		if (employeeRepository.saveAll(checkingEmployeeInfo) != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee updateOrCreateEmployee(Employee employee) {
		// findById(Integer id):Optional< Employee >
		Optional<Employee> existingEmployeeId = employeeRepository.findById(employee.getEmployeeId());
		if (existingEmployeeId.isPresent()) {
			employee.setUpdatedOn(new Date());
			employee.setUpdatedSource("updateOrCreateEmployee");
			employee.setUpdatedBy("Nandhan");
			return employeeRepository.save(employee);
		} else {
			employee.setCreatedBy("Nandhan");
			employee.setCreatedSource("updateOrCreateEmployee");
			employee.setCreatedOn(new Date());
			return employeeRepository.save(employee);
		}
	}

	@Override
	public String updateEmployee(EmployeeDto employeeDto) {
		// findById(Integer id):Optional< Employee >
		Optional<Employee> updatingExistingId = employeeRepository.findById(employeeDto.getEmployeeId());
		try {
			if (updatingExistingId.isPresent()) {
				Employee employee = updatingExistingId.get();
				employee.setFirstName(employeeDto.getFirstName());
				employee.setLastName(employeeDto.getLastName());
				employee.setAge(employeeDto.getAge());
				employee.setSalary(employeeDto.getSalary());
				employee.setEmail(employeeDto.getEmail());
				employee.setUpdatedBy("Rahul kumar");
				employee.setUpdatedSource("updateEmployee");
				employee.setUpdatedOn(new Date());
				employeeRepository.save(employee);
				return "employee is updated succesfully";
			} else {
				return "employeeId not existed";
			}
		} catch (Exception e) {
			return "we got an exception";
		}

	}

	@Override
	public boolean updatedEmployeeSuccessfully(EmployeeDto employeeDto) {
		// findById(Integer id):Optional< Employee >
		Optional<Employee> updateEmployee = employeeRepository.findById(employeeDto.getEmployeeId());
		try {
			if (updateEmployee.isPresent()) {
				Employee employee = updateEmployee.get();
				employee.setFirstName(employeeDto.getFirstName());
				employee.setLastName(employeeDto.getLastName());
				employee.setAge(employeeDto.getAge());
				employee.setSalary(employeeDto.getSalary());
				employee.setEmail(employeeDto.getEmail());
				employee.setUpdatedBy("Rahul kumar");
				employee.setUpdatedSource("updateEmployee");
				employee.setUpdatedOn(new Date());
				employeeRepository.save(employee);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.findById(id).orElse(null);

	}

}

//    public  Long generateRandomId(){
//            Random random=new Random();
//            Long randomNumber= random.nextLong(90000)+1000;
//          //  String id= String.format("%05d", randomNumber);
//         //   System.out.println("String random number is "+id);
//            return  randomNumber;
//            // EMP12635
//        }
