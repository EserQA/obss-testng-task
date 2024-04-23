package tech.obss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppTest{
    public static WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test()
    public void test1(){
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google","Title is not as expected");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
