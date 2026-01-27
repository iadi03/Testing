package org.testng.annotations;


public class Login {
  @Test
  public void login()
  	{
	  	System.out.println("Login page");
  	}
  
  @Test(dependsOnMethods="login")
  	public void home()
  		{
	  		System.out.println("Home page");
  		}
	}
