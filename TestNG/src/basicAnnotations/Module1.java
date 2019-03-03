package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 {
	
	
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Module");
	}
	@BeforeMethod
	public void beforeTestScript()//pre conditions
	{
		System.out.println("Befor test Script");
	}
	
	@AfterMethod
	public void AfterTestScript() //post condition
	{
		System.out.println("After test Script");
	}
	//by using TestNG annotation we need not to create object of class to call the method
	@Test
	public void test1()
	{
		System.out.println("Login test case");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Logout test case");
		
	}
}
