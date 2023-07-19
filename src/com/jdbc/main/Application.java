package com.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.dao.EmployeeDaoImplementation;
import com.jdbc.model.Employee;

public class Application {

	public static void main(String[] args)
		throws SQLException
	{

		Employee emp = new Employee();
		emp.setEmp_name("Haider");
		emp.setEmp_address("Mars");
		EmployeeDaoImplementation empDao = new EmployeeDaoImplementation();

		// add
		empDao.add(emp);

		// read
		Employee e = empDao.getEmployee(1);
		System.out.println(emp.getEmp_id() + " "+ emp.getEmp_name() + " "+ emp.getEmp_address());

		// read All
		List<Employee> ls = empDao.getEmployees();
		for (Employee allEmp : ls) {
			System.out.println(allEmp);
		}

		// update
		Employee setEmployee = empDao.getEmployee(1);
		setEmployee.setEmp_address("Asgard");
		empDao.update(setEmployee);

		// delete
		empDao.delete(1);
	}
}