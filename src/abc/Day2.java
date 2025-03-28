package abc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

//defined in tesngannotation.xml
	
	@Test
	public void TestCase1() {
		System.out.println("Execute TC1");
	}
	@Test
	public void TestCase2() {
		System.out.println("execute TC2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("execute before each method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("execute after every method");
	}
	@BeforeClass
	public void beforeThisClass() {
		System.out.println("execute before this class");
	}
	@BeforeTest
	public void beforeThisTest() {
		System.out.println("execute before this test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("execute before suite");
	}
	
// include and exclude will use to execute or don't execute the methods 
	@Test
	public void forinclude() {
		System.out.println("include this");
	}
	@Test
	public void forexclude() {
		System.out.println("exclude this");
	}
	
	@Test
	public void forinclude1() {
		System.out.println("include this 1");
	}
	@Test
	public void forexclude1() {
		System.out.println("exclude this 1");
	}
	
	

	

	
	
}
