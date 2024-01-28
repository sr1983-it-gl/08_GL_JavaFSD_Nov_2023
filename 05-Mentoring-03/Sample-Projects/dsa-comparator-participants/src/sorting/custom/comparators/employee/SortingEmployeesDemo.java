package sorting.custom.comparators.employee;

import java.util.Collections;
import java.util.List;

import testdata.TestData;

public class SortingEmployeesDemo {

	public static void main(String[] args) {				
		
		// Comparison
			// 
		
		
		// e1 e2 [WorkExperience - ASC]
		// Input -> John [5], Mary [4], Susan [4]
		// Output -> {Mary [4], John [5]}
		
		// e1 e2 [WorkExperience - DESC]
		// Output -> {John [5], Mary [4]}
		
		
		
		List<Employee> allEmployees = TestData.employeesList();						
		
		sortBasedOnLowestSalary(allEmployees);		
//		sortBasedOnHighestSalary(allEmployees);
		
//		sortBasedOnHighestWorkExperience(allEmployees);
		
		
	}
	
	static void sortBasedOnLowestSalary(List<Employee> allEmployees) {

		System.out.println("Before Sorting");
		System.out.println(allEmployees);
		System.out.println();
		
		EmployeeComparatorBasedOnLowestSalary lowSalaryComparator 
			= new EmployeeComparatorBasedOnLowestSalary();
		
		Collections.sort(allEmployees, lowSalaryComparator);
		
		System.out.println("After Sorting -> Based on Lowest Salary");
		System.out.println(allEmployees);		
	}


	static void sortBasedOnHighestSalary(List<Employee> allEmployees) {

		System.out.println("Before Sorting");
		System.out.println(allEmployees);
		System.out.println();
		
		EmployeeComparatorBasedOnHighestSalary highSalaryComparator 
			= new EmployeeComparatorBasedOnHighestSalary();
		
		Collections.sort(allEmployees, highSalaryComparator);
		
		System.out.println("After Sorting -> Based on Highest Salary");
		System.out.println(allEmployees);		
	}

	
	static void sortBasedOnHighestWorkExperience(List<Employee> allEmployees) {

		System.out.println("Before Sorting");
		System.out.println(allEmployees);
		System.out.println();
		
		EmployeeComparatorBasedOnHighestWorkExperience highestWorkExpComparator 
			= new EmployeeComparatorBasedOnHighestWorkExperience();
		
		Collections.sort(allEmployees, highestWorkExpComparator);
		
		System.out.println("After Sorting -> Based on Higher Work Experience");
		System.out.println(allEmployees);		
	}
	
}

/*
 * 
 *  for (outer loop)
 *  	for (inner loop)
 *  		e1
 *  		e2
 *  
 *  		if (e1 < e2)
 *  			swap ()
 * 			
 * 			if (e1 > e2)
 *  
 *
 */
