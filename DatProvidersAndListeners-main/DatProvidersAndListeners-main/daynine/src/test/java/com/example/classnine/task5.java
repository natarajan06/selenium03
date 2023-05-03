package com.example.classnine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
	WebDriver driver= new EdgeDriver();
	@BeforeTest
	public void beforetest() 
	{
		WebDriverManager.edgedriver().setup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	public void tc_001() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Suvitha");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("12345",Keys.ENTER);
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
}
