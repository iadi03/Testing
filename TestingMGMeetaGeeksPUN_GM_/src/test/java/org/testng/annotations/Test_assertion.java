package org.testng.annotations;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Test_assertion {
 
@Test
  public void f() {
	  
	  String actualTitle = "8";
	  String expectedTitle = "9";

        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");
        
        Assert.assertEquals( 2+2, 4 , "Title match!");

        System.out.println("This will not print if assert fails");
  }



@Test
public void testSoftAssert() {
    SoftAssert softAssert = new SoftAssert();

    int actualCount = 5;
    int expectedCount = 10;

    softAssert.assertTrue(actualCount > expectedCount, "Count is not greater!");
    softAssert.assertEquals(2+2 , 8, "fail");

    System.out.println("This WILL print even if assertions above fail");

    softAssert.assertAll();
	}
}
