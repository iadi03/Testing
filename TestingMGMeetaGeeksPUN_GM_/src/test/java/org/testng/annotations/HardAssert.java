package org.testng.annotations;

import org.testng.Assert;

public class HardAssert {
  
	
	@Test
    public void shouldShowLoginTitle() {

	String title = "Home";
        Assert.assertTrue(title.contains("Login"), "Title must contain 'Login'");
    }

    @Test
    public void shouldShowLogo() {
        boolean logoVisible = false;
        Assert.assertTrue(logoVisible, "Logo should be visible");
    }

    @Test
    public void shouldHaveSignInButton() {
        String btnText = "Sign In";
        Assert.assertEquals(btnText, "Sign In", "Button text matched");  
        
       System.out.println("This will not print if assert fails");
  }
}


