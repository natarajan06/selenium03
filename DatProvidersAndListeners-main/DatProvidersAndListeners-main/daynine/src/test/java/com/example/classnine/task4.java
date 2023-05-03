package com.example.classnine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	WebDriver driver;
@Parameters("browsers")
  @BeforeTest
  public void browserSelection(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.edgedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
  }
@Test
public void tc_001() throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
	  Thread.sleep(5000);
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
}
}
