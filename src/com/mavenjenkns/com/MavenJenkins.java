package com.mavenjenkns.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MavenJenkins 
{
	public ExtentReports e = new ExtentReports(".\\ExtentReport\\ExtentReport.html");
  @Test(priority=1)
  public void MavenJenkinsMethod_Pass()
  {
	  System.out.println("Hi");
	  
	  ExtentTest t = e.startTest("MavenJenkinsMethod_Pass");// provide this method name itself
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  Reporter.log("facebook login", true);
	  Reporter.log("MavenJenkins integration", true);
	  
	  t.log(LogStatus.PASS, "Executing MavenJenkinsMethod successful");
	 //t.log(LogStatus.ERROR, "Error during execution");
	  t.log(LogStatus.INFO, "info of exexuting method");
	  e.endTest(t);
  }
  
  @Test(priority=2)
  public void MavenJenkinsMethod_Fail()
  {
	  System.out.println("Bye");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  Reporter.log("facebook login", true);
	  Reporter.log("MavenJenkins integration", true);
	  
	  ExtentTest t = e.startTest("MavenJenkinsMethod_Fail");// provide this method name itself
	  t.log(LogStatus.FAIL, "Executing MavenJenkinsMethod Fail");  
	  e.endTest(t);
	  e.flush();
  }

}
