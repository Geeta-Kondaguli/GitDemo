package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("I run after every method in this class");
	}
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute at the end");
	}
@Test(groups= {"smoke"})
public void demo()
{
	System.out.println("Hello");
}
@Test
public void demo1()
{
	System.out.println("Bye");
}

}
