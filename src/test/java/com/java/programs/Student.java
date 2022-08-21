package com.java.programs;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Student implements ITestListener {
	
  
	public void onTestStart(ITestResult result) {
	    System.out.println("Test case name is "+ result.getName());
	}
	
	 public void onTestSuccess(ITestResult result) {
		  System.out.println("Test case name is "+ result.getName());
		  }

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
		  public void onTestFailure(ITestResult result) {
			  System.out.println("Test case name is "+ result.getName());
		  }

		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
		  public void onTestSkipped(ITestResult result) {
			  System.out.println("Test case name is "+ result.getName());
		  }

		  /**
		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
		   * still keeps it within the success percentage requested.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
		   */
		  
	
	
}
