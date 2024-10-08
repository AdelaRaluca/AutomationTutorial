package tests;

import helpMethods.ElementMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;

    ElementMethods elementMethods = new ElementMethods(driver);
    @Test
    public void metodaTest() {
        // deschidem un browser
        driver = new ChromeDriver();
        //accesam un url
        driver.get("https://demoqa.com/");
        //facem browserul maximise
        driver.manage().window().maximize();

        //identificarea unui element dupa text - xpath (tag, atribut, valoare) - identificare relativa // sau absoluta /- nu facem absolut (ex://h5[text()= "Elements"])

        WebElement formsMenu = driver.findElement(By.xpath("//h5[text()= 'Forms']"));
        elementMethods.clickJSElement(formsMenu);
        WebElement practiceFormSubMenu = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickJSElement(practiceFormSubMenu);

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        elementMethods.fillElement(firstNameElement, "Mirza");
        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        elementMethods.fillElement(lastNameElement, "Adela");

        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        elementMethods.fillElement(userEmailElement, "test@test.com");

        List<WebElement> genderOptionsList = driver.findElements(By.xpath("//input[@name='gender']"));
        String genderValue = "Female";

        switch (genderValue) {
            case "Male":
                elementMethods.clickElement(genderOptionsList.get(0));
                break;
            case "Female":
                elementMethods.clickJSElement(genderOptionsList.get(1));
                break;
            case "Other":
                elementMethods.clickJSElement(genderOptionsList.get(2));
                break;
        }

        WebElement mobileNumberElement = driver.findElement(By.id("userNumber"));
        String mobileNumberlValue = "0112345678";
        mobileNumberElement.sendKeys(mobileNumberlValue);

        WebElement subjectElement = driver.findElement(By.id("subjectsInput"));
        List<String> subjectValues = Arrays.asList("Accounting", "Maths", "English");
        for (int index = 0; index < subjectValues.size(); index++) {
            subjectElement.sendKeys(subjectValues.get(index));
            subjectElement.sendKeys(Keys.ENTER);
        }

        List<String> hobbiesValues = Arrays.asList("Sports", "Music");
        List<WebElement> hobbiesOptionsList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));

        for (int index = 0; index < hobbiesOptionsList.size(); index++) {
            String currentText = hobbiesOptionsList.get(index).getText();
            if (hobbiesValues.contains(currentText)) {
                elementMethods.clickJSElement(hobbiesOptionsList.get(index));
            }
        }

        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/FREE TESTING.txt");
        pictureElement.sendKeys(file.getAbsolutePath());

        WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
        String currentAddressValue = "0112345678";
        mobileNumberElement.sendKeys(currentAddressValue);

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();

        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        String monthValue = "March";
        elementMethods.selectDropdownElement(monthElement, monthValue);

        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        String yearValue = "1989";
        elementMethods.selectDropdownElement(yearElement, yearValue);

        String dayValue = "21";
        List<WebElement> daysList = driver.findElements(By.xpath("//div[@class = 'react-datepicker__month-select"));
        for (int index = 0; index < daysList.size(); index ++){
            if (daysList.get(index).getText().equals(dayValue)){
                daysList.get(index).click();
                break;
            }
        }

        WebElement stateElement = driver.findElement(By.xpath("//div[text()= 'Select State']"));
elementMethods.clickJSElement(stateElement);

        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateValue = "NCR";
        stateInputElement.sendKeys(stateValue);
        stateInputElement.sendKeys(Keys.ENTER);
        // pentru dropdown am facut metoda asta

        WebElement cityElement = driver.findElement(By.xpath("//div[text()= 'Select City']"));
        elementMethods.clickJSElement(cityElement);

        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityValue = "Delhi";
        cityInputElement.sendKeys(cityValue);
        cityInputElement.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        elementMethods.clickJSElement(submitElement);

        //validam datele introduse

//        WebElement tyElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        Assert.assertEquals(tyElement.getText(), "Thanks for submitting the form");
//        List<WebElement> labelList = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']//td[1]"));
//        List<WebElement> labelValue = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']//td[2]"));
//
//        Assert.assertEquals(labelList.get(0).getText(), "Student Name");
//        Assert.assertEquals(labelList.get(1).getText(), "Student Email");
//        Assert.assertEquals(labelList.get(2).getText(), "Gender");
//        Assert.assertEquals(labelList.get(3).getText(), "Mobile");
//        Assert.assertEquals(labelList.get(4).getText(), "Date of Birth");
//        Assert.assertEquals(labelList.get(5).getText(), "Subjects");
//        Assert.assertEquals(labelList.get(6).getText(), "Hobbies");
//        Assert.assertEquals(labelList.get(7).getText(), "Picture");
//        Assert.assertEquals(labelList.get(8).getText(), "Address");
//        Assert.assertEquals(labelList.get(9).getText(), "State and City");
//
//        System.out.println(labelValue.get(0).getText());
//
//        Assert.assertEquals(labelValue.get(0).getText(), firstNameValue+" "+lastNameValue);
//        Assert.assertEquals(labelValue.get(1).getText(), userEmailValue);
//        Assert.assertEquals(labelValue.get(2).getText(), genderValue);
//        Assert.assertEquals(labelValue.get(3).getText(), mobileNumberlValue);
//de continuat
    }
}