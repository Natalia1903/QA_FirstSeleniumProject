package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstFindElementTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




    @Test
    public void findElementsByTagTest(){
        //find elemeunt by tag
        WebElement element = driver.findElement(By.tagName("a"));
        System.out.println(element.getText());
        //find list of items by tag
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement element1 = driver.findElement(By.tagName("h1"));
        System.out.println(element1.getText());

        WebElement container = driver.findElement(By.className("container"));
        System.out.println(container.getText());

    }

        @AfterMethod(enabled = false)
        public void tearDown(){
            driver.quit();
        }








}
