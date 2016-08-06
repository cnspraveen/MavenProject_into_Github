package com.mavenjenkns.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenJenkins 
{
  @Test
  public void MavenJenkinsMethod()
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  Reporter.log("facebook login", true);
	  Reporter.log("MavenJenkins integration", true);
  }

}
