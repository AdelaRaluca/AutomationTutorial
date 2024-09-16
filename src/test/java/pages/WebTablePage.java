package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;

public class WebTablePage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver, this);

    }

}
