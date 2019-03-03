package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2 {
	

	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module2");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Module2");
	}
	@BeforeMethod
	public void beforeTestScript()//pre conditions
	{
		System.out.println("Befor test Script2");
	}
	
	@AfterMethod
	public void AfterTestScript() //post condition
	{
		System.out.println("After test Script2");
	}
	//by using TestNG annotation we need not to create object of class to call the method
	@Test
	public void test1()
	{
		System.out.println("Login test case2");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Logout test case2");
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
