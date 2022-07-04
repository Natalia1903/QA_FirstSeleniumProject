package com.telran.qa;


        import org.openqa.selenium.By;
        import org.testng.Assert;
        import org.testng.annotations.Test;
public class GreenDataLogin extends GreenDataBase{


    @Test
    public void loginUserPositiveTest() {
        //click on Login link
        login();

        Assert.assertTrue(isElementPresent(By.xpath("//*[@id='userName']")));
    }

}