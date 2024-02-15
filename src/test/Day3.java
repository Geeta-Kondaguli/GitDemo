package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I run before every method in this class");
	}

	@Test
	public void webLoginCarLoan()
	{
		//selenium
		System.out.println("webLoginCar");
	Assert.assertTrue(false);
	}
	@Test
	public void mobileLoginCarLoan()
	{
		//appium
		System.out.println("mobileLoginCar");
	}
	@Test(enabled=false)
	public void mobileSigninCarLoan()
	{
		//appium
		System.out.println("mobileSignInCar");
	}
	@Test(dataProvider="getData")
	public void mobileSignoutCarLoan(String username, String password)
	{
		//appium
		System.out.println("mobileSignoutCar");
		System.out.println(username);
		System.out.println(password);
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am the number 1 from the last in the execution");
	}
	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void loginAPICarLoan()
	{
		//Rest API Automation
		System.out.println("loginAPICar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st set= username and pw with good credit history
		//2nd set= username and password with no credit history
		//3rd set=UN and PW with fraudelent credit history
		
		Object[][] data=new Object[3][2];
		//Scenario1
		data[0][0]="FirstsetUsername";
		data[0][1]="firstsetpassword";
		//Scenario2
		data[1][0]="secondsetUsername";
		data[1][1]="secondsetpassword";
		//Scenario3
		data[2][0]="thirdsetUsername";
		data[2][1]="third setpassword";
		return data;
		
	}

}
