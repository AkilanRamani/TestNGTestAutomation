package testautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class it_department {
	
	@BeforeMethod
	public void software_development()  
	  {  
	      System.out.println("Before Method in IT Department will be executed before every test method ");  
	  }  

	@AfterMethod                                             // annotated method placed in the beginning.  
	  public void before_test()  
	  {  
	      System.out.println("After Method in IT Department will be executed after every test method");  
	  }  
	  @Test  
	  public void software_developers()  
	  {  
	      System.out.println("Software Developers");  
	  }  
	    
	  @Test  
	  public void software_testers()  
	  {  
	      System.out.println("Software Testers");  
	  }  
	    
	  @BeforeClass  
	  public void qa_analyst()  
	  {  
	      System.out.println("Before class in IT Department class will be executed before all the Test cases that are contained in a specific class");  
	  }
	  
	  @AfterClass
	  public void qa_analyst1()  
	  {  
	      System.out.println("After class in IT Department class will be executed after all the Test cases that are contained in a specific class");  
	  }  
}
