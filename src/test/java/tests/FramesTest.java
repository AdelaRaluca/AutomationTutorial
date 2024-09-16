package tests;

import helpMethods.ElementMethods;
import helpMethods.FrameMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class FramesTest {
    public WebDriver driver;
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
        FrameMethods frameMethods = new FrameMethods(driver);
        FramesPage framesPage = new FramesPage(driver);

        HomePage homePage = new HomePage(driver);
        homePage.clickAlertFrameWindow();


        WebElement alertsFrameWindowsMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertsFrameWindowsMenu);

        WebElement framesSubMenu = driver.findElement(By.xpath("//span[text()='Frames']"));
        js.executeScript("arguments[0].click();", framesSubMenu);


        //ne mutam pe un IFrame
        driver.switchTo().frame("frame1");

        WebElement sampleTextElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(sampleTextElement.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");

        WebElement sample2TextElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(sample2TextElement.getText());

        //tema: nested frames

    }
}
