package tests;

import helpMethods.AlertMethods;
import helpMethods.ElementMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertPage;
import pages.HomePage;

import java.time.Duration;

public class Alerts{
    public WebDriver driver;

        ElementMethods elementMethods = new ElementMethods((driver));

        @Test

        public void metodaTest() {
            // deschidem un browser
            driver = new ChromeDriver();
            //accesam un url
            driver.get("https://demoqa.com/");
            //facem browser-ul maximize
            driver.manage().window().maximize();
            //wait implicit
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            ElementMethods elementMethods = new ElementMethods(driver);
            AlertMethods alertMethods = new AlertMethods(driver);

            HomePage homePage = new HomePage(driver);
            homePage.clickAlertFrameWindow();

            AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(driver);
            alertFrameWindowPage.clickAlertFrameWindow();

            AlertPage alertPage = new AlertPage(driver);
            alertPage.dealWithAlertPage();

        }
}