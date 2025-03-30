package main.java.abc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@AfterClass
	public void AftClass()
	{
		System.out.println("execute After this day2 class");
	}

	@Parameters({"Link"})
	@Test()
	public void SencondDay(String uname)
	{
		System.out.println("Day2 Bye");
		System.out.println(uname);
	}
	
	@BeforeMethod
	public void BeforeMeth()
	{
		System.out.println("execute before every method in day2 class");
	}
	
	@AfterMethod
	public void AfterMeth()
	{
		System.out.println("execute after every method in day2 class");
	}
	@BeforeClass
	public void BefClass()
	{
		System.out.println("execute before this day2 class");
	}

}
