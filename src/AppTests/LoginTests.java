import com.tieste.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;


public class LoginTests {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {"160","45","17.6","Underweight"},
                new Object[] {"168","70","24.8","Normal"},
                new Object[] {"181","89","27.2","Overweight"},
                new Object[] {"178","100","31.6","Obesity"},
        };
    }
    /*
    * @Test(dataProvider = "pageObjects")
    public void testSearch(final SearchPage searchPage) {
        searchPage.init(driver);
        driver.get("http://ya.ru");
        searchPage.search("Bolek i Lolek");
    }

    @DataProvider
    private Object[][] pageObjects() {
        return new Object[][]{
                {new SimpleSearchPage()},
                {new AnnotatedSearchPage()},
                {new ExtendedSearchPage()},
                {new SearchPageWithSearchForm()}
        };
    }*/
    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
        TestHelper.slp(5);
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", TestHelper.drv.getTitle());
        System.out.println(TestHelper.drv.getTitle());
    }

    @Test
    public void testSignInDeveloperPositive() {

        TestHelper.drv.findElement(By.linkText("Sign in")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("email")).clear();
        TestHelper.drv.findElement(By.name("email")).sendKeys("apppicker_developer@ukr.net");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("password")).clear();
        TestHelper.drv.findElement(By.name("password")).sendKeys("apppicker_developer@ukr.net");

        TestHelper.drv.findElement(By.xpath("//button")).click();
        TestHelper.slp(5);
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("a.mc-header-sign-profile")).getText(),
                "Lilia_developer");
        TestHelper.drv.quit();
    }

    @Test
    public void testSignInDeveloperNegative01() {

        TestHelper.drv.findElement(By.linkText("Sign in")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("email")).clear();
        TestHelper.drv.findElement(By.name("email")).sendKeys("apppicker_developer@ukr.net");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("password")).clear();
        TestHelper.drv.findElement(By.name("password")).sendKeys("apppicker_developer1");

        TestHelper.drv.findElement(By.xpath("//button")).click();
        TestHelper.slp(5);
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText(),
                "Your email or password is wrong");

        TestHelper.drv.quit();
    }

    @Test
    public void testSignInDeveloperNegative02() {

        TestHelper.drv.findElement(By.linkText("Sign in")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("email")).clear();
        TestHelper.drv.findElement(By.name("email")).sendKeys("apppicker_dev@ukr.net");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.name("password")).clear();
        TestHelper.drv.findElement(By.name("password")).sendKeys("apppicker_developer@ukr.net");

        TestHelper.drv.findElement(By.xpath("//button")).click();
        TestHelper.slp(5);
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText(),
                "Your email or password is wrong");

        TestHelper.drv.quit();
    }

/* Login.pressSignIn();
        Login.emailField("apppicker_developer@ukr.net");*/
       /* Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        Assert.assertEquals("Lilia_developer", Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        TestHelper.slp(5);*/



    @After
    public void afterDriver(){
        TestHelper.drv.quit();
    }
}
