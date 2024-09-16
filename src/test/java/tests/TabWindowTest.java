package tests;

import helpMethods.ElementMethods;
import helpMethods.TabMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.TabWindowPage;

import java.util.ArrayList;
import java.util.List;

public class TabWindowTest {
    public WebDriver driver;

    @Test
    public  void metodaTestTabs(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        TabMethods tabMethods = new TabMethods(driver);
        TabWindowPage tabWindowPage = new TabWindowPage();

        WebElement browseMenu = driver.findElement(By.xpath("//h5[text()= 'Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",browseMenu);

        WebElement browserWindowElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        js.executeScript("arguments[0].click();", browserWindowElement);

        WebElement newTabElement = driver.findElement(By.id("tabButton"));
        js.executeScript("arguments[0].click();", newTabElement);

        tabMethods.switchSpecificTab(1);
        tabMethods.closeCurrentTab();
        tabMethods.switchSpecificTab(0);

        WebElement newWindowElement = driver.findElement(By.id("windowButton"));
        js.executeScript("arguments[0].click();", newWindowElement);
        System.out.println("URL - ul paginii curente este"+driver.getCurrentUrl());

        tabMethods.switchSpecificTab(1);
        tabMethods.closeCurrentTab();

        driver.quit();
    }
}
