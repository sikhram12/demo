package com.sparkle.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkle.demo.dao.EmployeeRepository;
import com.sparkle.demo.dao.UsaCitiesRepository;
import com.sparkle.demo.model.Employee;
import com.sparkle.demo.model.UsaCities;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UsaCitiesRepository usaCitiesRepository;
	
	public Employee createEmployee(Employee employee){
		Employee savedEmployeeObj = employeeRepository.save(employee);
		return savedEmployeeObj;
		
	}

	public List<Employee> getAllEmployesList() {
		List<Employee> employesList = employeeRepository.findAll();
		return employesList;
	}

	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee Details Sucessfully updated";
	}

	public String deleteEmployee(String id) {
		employeeRepository.deleteById(id);
		return "Employee Details Sucessfully deleted";
	}

	public List<UsaCities> fetchAllUsaCities() {
		return usaCitiesRepository.findAll();
	}
	
	public Map<String, Map<String, String>> stateWithCities() {
		Map<String, Map<String, String>> map = new HashMap<>();
		
		List<UsaCities> list = usaCitiesRepository.findAll();
		list.forEach(arg0->{
			if (map.get(arg0.getState_name()) != null) {
				//Map<String, String> cities = new HashMap<>();
				//cities.put(arg0.getCity(), arg0.getZips());
				map.get(arg0.getState_name()).put(arg0.getCity(), arg0.getZips());
			//map.put(arg0.getState_name(), cities);
			}else {
				Map<String, String> cities = new HashMap<>();
				cities.put(arg0.getCity(), arg0.getZips());
				map.put(arg0.getState_name(), cities);
			}
		});
//		list.forEach(arg0->{
//			if(cities.containsValue(arg0.getCity())) {
//				map.put(arg0.getState_name(), cities);
//			}
//		});
		return map;
	}
	
//	if (appMap.get(Constants.CURRENT_APP) != null) {
//		appMap.get(Constants.CURRENT_APP).add(profile.getApplication());
//	} else {
//		List<String> list = new ArrayList<>();
//		list.add(profile.getApplication());
//		appMap.put(Constants.CURRENT_APP, list);
//	}

}
