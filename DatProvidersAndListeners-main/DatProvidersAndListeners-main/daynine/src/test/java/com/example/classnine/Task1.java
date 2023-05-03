package com.example.classnine;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task1 {
  @Test(dataProvider = "data")
  public void add(int num1,int num2,int expected)
	  {
	  //System.err.println(num1+num2);
	  //System.out.println(result);
	  int actual=num1+num2;
	  Assert.assertEquals(expected, actual);
  }
  @Test(dataProvider="data")
  public void sub(int num1,int num2,int expected) {
	  int actual=num1-num2;
	  Assert.assertEquals(actual,expected);
  }
  @Test(dataProvider="data")
  public void multi(int num1,int num2,int expected) {
	  int actual=num1*num2;
	  Assert.assertEquals(actual,expected);
  }
  @Test(dataProvider="data")
  public void div(int num1,int num2,int expected) {
	  int actual=num1/num2;
	  Assert.assertEquals(actual,expected);
  }
  @DataProvider(name="data")
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {1,2,5 },
		  new Object[] {2,3,5 },
		  new Object[] {4,2,2}
	  };
  }
  }
