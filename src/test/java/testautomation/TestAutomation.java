package testautomation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAutomation {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test will start before all the Test Method Execution" );
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test will start before all the Test Method Execution" );
	}
	
    
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Before suite will start before all the Test Method Execution" );
	}
	
	@BeforeClass
	public void testclass() {
		System.out.println("Before class will start before each the Test Method Execution" );
	}
	
	@AfterClass
	public void testclassafter() {
		System.out.println("After class will start before each the Test Method Execution" );
	}
	@BeforeMethod
	public void testBefore() {
		System.out.println("Before Method will start before each the Test Method Execution" );
		
	}
	@Test
	public void test() {
		System.out.println("Test case is passed" );
		Assert.assertTrue(true);
	}
	
	@Test
	public void test1() {
		System.out.println("Test case is failed" );
		Assert.assertTrue(true);
	
	}
	@AfterMethod
	public void testAfter() {
		System.out.println("After method is executed after Test case is completed " );
		
	}
	 
		@AfterSuite
		public void testAfterSuite() {
			System.out.println("After suite will start before all the Test Method Completion" );
		}
}
