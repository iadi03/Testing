package com.testng.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestngDay2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("EmpId is: " + n);
	  System.out.println("Emp name: " + s);
  }
  public void f1(Integer n, String s) {
	  System.out.println(n+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 100, "emp1" },
      new Object[] { 101, "emp2" },
      new Object[] { 102, "emp2" },
    };
  }
}
