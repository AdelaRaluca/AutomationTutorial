package tests;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public FramesMethods framesMethods;

    public FramesPage(WebDriver driver) {
        elementMethods = new ElementMethods(this.driver);
        framesMethods = new FramesMethods(this.driver);
    }
}
