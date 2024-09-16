package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public  AlertPage(WebDriver driver){
        this.driver=driver;
        elementMethods=new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id= "alertButton")
    public WebElement okAlert;
    @FindBy
}
