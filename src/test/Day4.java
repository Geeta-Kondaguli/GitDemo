package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String urlname)
	{
		//selenium
		System.out.println("webLoginHome");
		System.out.println(urlname);
	}
	@Test
	public void mobileLoginHomeLoan()
	{
		//appium
		System.out.println("mobileLoginHome");
	}
	@Test(groups= {"smoke"})
	public void loginAPIHomeLoan()
	{
		//Rest API Automation
		System.out.println("loginAPIHome");
	}

}
