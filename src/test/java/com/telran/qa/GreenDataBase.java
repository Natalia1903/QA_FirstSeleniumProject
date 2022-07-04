package com.telran.qa;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import java.util.NoSuchElementException;
        import java.util.concurrent.TimeUnit;

public class GreenDataBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://gdcloud.ru/release-17/auth/login.html#/?_k=gg6ctj");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public boolean isElementPresent2(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);

    }

    public void login() {
        type(By.cssSelector("[placeholder='Номер телефона или E-mail']"), "tester");
        type(By.cssSelector("[placeholder='Пароль']"), "K35G3U");
        click(By.xpath("//button[contains(.,'Войти')]"));


    }
}