package com.sonata.devopstestcases;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.business.test.TestEmployeeDetail;

public class TestRunner {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	public static void main(String[] args) {
	      org.junit.runner.Result result = JUnitCore.runClasses(TestEmployeeDetail.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }
	
	
	
}
