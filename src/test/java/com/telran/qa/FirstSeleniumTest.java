package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    WebDriver driver;

    //befor - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        // driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!");
    }

    @Test
    public void navigateTest(){
        //go back
        driver.navigate().back();
        //go forward
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();
    }
    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        //close browser
        //all tabs
        driver.quit();
        //one tab
        //driver.close();
    }
}