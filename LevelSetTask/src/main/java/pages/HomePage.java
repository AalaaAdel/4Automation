package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private String url="https://www.levelset.com/";
    private By paidButton=By.xpath("//a[@class='btn btn-info btn-outline mob-dropdown-btn']");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void navigateToHomePage(){
        driver.get(url);
        WebElement element3=driver.findElement(paidButton);
        Assert.assertTrue(element3.isDisplayed());

    }

    public DocumentPage clickGetPaid(){
        new  WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(paidButton));
        driver.findElement(paidButton).click();
        driver.findElement(paidButton).click();

      //  asser 3la elem mn sf7t el doc
        return new DocumentPage(driver);
    }




}
