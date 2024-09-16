package pages;

import helpMethods.ElementMethods;
import helpMethods.TabMethods;
import org.openqa.selenium.WebDriver;

public class TabWindowPage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public TabMethods tabMethods;

    public TabWindowPage(WebDriver driver){
        this.driver = driver;

    }
}
