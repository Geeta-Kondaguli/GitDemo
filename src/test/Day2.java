package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am the number 1 in execution");
	}
	@Test(groups= {"smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}

}
