package com.sonata.businessmodel;
import com.sonata.devops.EmployeeDetails;
import java.io.*;
import java.lang.Math.*;
public class EmpBusinessLogic {
	
	
	
	// Calculate the yearly salary of employee
	   public double calculateYearlySalary(EmployeeDetails employeDetails){
	      double yearlySalary=0;
	      yearlySalary = employeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(EmployeeDetails employeDetails){
	      double appraisal=0;
	      if(employeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
	      return appraisal; 
	   }
}
