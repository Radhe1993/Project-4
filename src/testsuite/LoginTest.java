package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest
{
    String baseUrl = "https://www.saucedemo.com/";
    @Before
    public void setUp()
    {
        openUrl();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValid()
    {
        //Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Enter “secret_sauce” password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        String expected = "Swag Labs";
        String actual = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        Assert.assertEquals(" should be display",expected,actual);
        System.out.println(actual);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage()
    {
        //Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Enter “secret_sauce” password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));
        System.out.println("Total products are = "+elements.size());
    }

}
