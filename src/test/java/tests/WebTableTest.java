//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class WebTableTest {
//    public WebDriver driver;
//
//    @Test
//    public void metodaTest(){
//
//        //deschidem un browser
//        driver = new ChromeDriver();
//
//        //deschidem un url
//        driver.get("https://demoqa.com/");
//
//       //facem browserul maximized
//        driver.manage().window().maximize();
//
////        definim un element
//        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
//        addElement.click();
//
//        WebElement firstNameElement=driver.findElement(By.id("firstName"));
//        String firstNameValue = "Adela";
//        firstNameElement.sendKeys(firstNameValue);
//
//        WebElement lastNameElement=driver.findElement(By.id("lastName"));
//        String lastNameValue = "Raluca";
//        lastNameElement.sendKeys(lastNameValue);
//
//        WebElement emailElement=driver.findElement(By.id("userEmail"));
//        String emailValue = "test@test.com";
//        emailElement.sendKeys(emailValue);
//
//        WebElement ageElement = driver.findElement(By.id("age"));
//        String ageValue = "25";
//        ageElement.sendKeys(ageValue);
//
//        WebElement salaryElement=driver.findElement(By.id("salary"));
//        String salaryValue = "15000";
//        salaryElement.sendKeys(salaryValue);
//
//        WebElement departamentElement=driver.findElement(By.id("department"));
//        String departamentValue = "Testing";
//        departamentElement.sendKeys(departamentValue);
//
//        WebElement submitElement=driver.findElement(By.id("submit"));
//        submitElement.click();
//
//        //validam dimensiunea initiala a tabelului
//
//        List<WebElement> newTableContentList = driver.findElements(By.xpath("//div[@class = 'rt-tbody']/div/div[@class = 'rt-tr -odd' or @class = 'rt-tr -even']"));
//        System.out.println("Dimensiunea tabelului este "+ tableContentList.size());
//    Assert.assertEquals(newTableContentList.size(), 3, "Default size for the table is not 4");
//
//    //validam valorile pe care le-am introdus
//        String rowContent = newTableContentList.get(3).getText();
//    Assert.assertTrue(rowContent.contains(firstNameValue),"The last row does not contain First Name value");
//
//
//    //validam valorile modificate din tabel
//        rowContent = newTableContentList.get(3).getText();
//        Assert.assertTrue(rowContent.contains(editFirstNameValue),"The last row does not contain First Name value");
//
//    //delete element
//
//
//
//        //validam dupa delete
//        List<WebElement> newTableContentList = driver.findElements(By.xpath("//div[@class = 'rt-tbody']/div/div[@class = 'rt-tr -odd' or @class = 'rt-tr -even']"));
//        System.out.println("Dimensiunea tabelului este "+ newTableContentList.size());
//
//
//
//    }
//
//}
