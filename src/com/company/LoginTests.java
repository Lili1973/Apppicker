package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTests {

    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", TestHelper.drv.getTitle());
        System.out.println(TestHelper.drv.getTitle());

    }
    @Test
    public void testSignInDeveloper() {
        Login.pressSignIn();
        Login.emailField("apppicker_developer@ukr.net");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        Assert.assertEquals("Lilia_developer", Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        TestHelper.slp(5);

    }
    @Test
    public void testSignInDeveloper2() {
        Login.pressSignIn();
        Login.emailField("0");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        TestHelper.slp(5);
        Assert.assertEquals("Incorrect login or password", Login.getErrorMessageLogin(Login.errorMessageLogin));

    }
    @After
    public void afterDriver(){
        TestHelper.drv.quit();
    }
}
