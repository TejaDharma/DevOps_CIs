package com.business.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

//import org.junit.Test; 

import com.sonata.businessmodel.EmpBusinessLogic;
import com.sonata.devops.EmployeeDetails;

public class TestEmployeeDetail {

	   EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
	   EmployeeDetails employee = new EmployeeDetails();
	   
	   @Test
	   public void test() {
		fail("Not yet implemented");
	    }

	 //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double salary= empBusinessLogic.calculateYearlySalary(employee);
	      assertEquals(96000, salary, 0.0);
	   } 
	
	
}
