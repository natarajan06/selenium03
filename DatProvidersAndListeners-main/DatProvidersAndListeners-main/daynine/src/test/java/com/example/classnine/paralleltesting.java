package com.example.classnine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltesting {
	WebDriver driver;
  @Test
  public void tc_001() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Thread.sleep(5000);
	  System.out.println("Smoke test");
	  driver.quit();
	  
  }
  @Test
  public void tc_002() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
//	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
//* domain:[@id="id-631b049a-e9c0-4d24-8710-c504745206dd"]/div[2]/div[1]/ul/li[1]/button
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
  //* domain search name:[@id="id-631b049a-e9c0-4d24-8710-c504745206dd"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a
	  Thread.sleep(3000);
	  System.out.println("Regression test one");
	  Assert.assertEquals(driver.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  driver.quit();
  }
  @Test
  public void tc_003() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  System.out.println("Regression test one");
	  Assert.assertEquals(driver.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  driver.quit();
  }
  
}
