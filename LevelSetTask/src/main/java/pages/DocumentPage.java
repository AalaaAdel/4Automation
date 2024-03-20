package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DocumentPage {

    private WebDriver driver;
    private String url="https://app.levelset.com/wizard/SelectDocument/?_ga=2.117032770.558159575.1710677577-659943753.1710677577";
   // By item=By.xpath("//div[@class ='panel-heading left-right-pair']/div[contains(text(),'Release a Lien')]");
   String itemName="Exchange a Waiver";
   String itemPrice="Free";
   String locator=String.format("//div[@class ='panel-heading left-right-pair']/div[contains(text(),'%s')]/following-sibling::div/span[contains(text(),'%s')]",itemName,itemPrice);
   By item= By.xpath(locator);



    public  DocumentPage(WebDriver driver){
       this.driver=driver;
   }

   public void navigateToDocumentPage(){
        driver.get(url);
   }
/*
  public String getPrice(){
      new  WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(item));
      String element =driver.findElement(item).getText();
      return element;
  }

 */


    public String getPrice(){

        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(item));
        }
        catch(TimeoutException e){
            driver.navigate().refresh();
        }
        String element =driver.findElement(item).getText();
        return element;
    }


}
