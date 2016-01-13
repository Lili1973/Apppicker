package com.tieste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


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
    @Test
    public void recoveryPassword() {
        Login.pressSignIn();
        Login.emailField("0");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        TestHelper.slp(5);
        Assert.assertEquals("Incorrect login or password", Login.getErrorMessageLogin(Login.errorMessageLogin));
        Login.pressRecoveryPassword();
        //TestHelper.slp(5);
        Login.recoveryEemailField("apppicker_developer@ukr.net");
        Assert.assertEquals("Instructions on how to reset your password were sent to your email.", Login.getMessageOk(Login.MessageOk));
        TestHelper.slp(5);
        TestHelper.drv.quit();
        TestHelper.setup(TestHelper.url_ukr_net);
        TestHelper.slp(5);
        Login.emailFieldUkrNet("apppicker_developer");
        Login.passwordFieldUkrNet("apppicker_developer");
        Login.pressLoginbuttonUkrNet();
        Login.pressMailBoxUkrNet();
        //List<WebElement> res=d.findElements(By.tagName("a"));
       // WebElement res1=res.get(0);
       // System.out.println(res1.getText());
        //res1.click();
        System.out.println("----------");
        TestHelper.slp(15);
        System.out.println(Login.getMessageOk(Login.mailSubject));
        Assert.assertEquals("You have requested password reset from appPicker.com ", Login.getMessageOk(Login.mailSubject));
      //  Assert.assertEquals("appPicker", Login.getMessageOk(Login.mailFrom));
        TestHelper.slp(10);
        //Assert.assertTrue("Text not found!", list.size() > 0);
    }
    @Test
    public void recoveryPassword_2() {
        Login.pressSignIn();
        Login.emailField("0");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        TestHelper.slp(5);
        Assert.assertEquals("Incorrect login or password", Login.getErrorMessageLogin(Login.errorMessageLogin));
        Login.pressRecoveryPassword();
        //TestHelper.slp(5);
        Login.recoveryEemailField("apppicker_developer@ukr.net");
        Assert.assertEquals("Instructions on how to reset your password were sent to your email.", Login.getMessageOk(Login.MessageOk));
        TestHelper.slp(5);
    }
    @Test
    public void signOut_test(){
        Login.pressSignIn();
        Login.emailField("apppicker_developer@ukr.net");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        Assert.assertEquals("Lilia_developer", Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        TestHelper.slp(5);
        Login.signOut();
        TestHelper.slp(5);
    }


    @After
    public void afterDriver(){
        TestHelper.drv.quit();
    }
}
