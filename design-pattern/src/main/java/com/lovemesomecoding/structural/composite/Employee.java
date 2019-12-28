package com.lovemesomecoding.structural.composite;

import java.util.List;

public interface Employee {

	/**
	 * @return the name of the employee
	 */
	String getName();

	/**
	 * @param e add this employee to the list of employees
	 */
	void add(Employee e);

	/**
	 * @param e remove this employee from the list of employees
	 */
	void remove(Employee e);

	/**
	 * @return the list of employees
	 */
	List<Employee> getEmployees();

	/**
	 * This method estimates the costs in ManDays for the given project. Managers
	 * delegate this request to their employees, developers return an estimate.
	 *
	 * @param projectDescription
	 * @return
	 */
	int estimateProject(String projectDescription);
}
