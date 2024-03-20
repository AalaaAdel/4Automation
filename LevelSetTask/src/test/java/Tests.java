import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DocumentPage;
import pages.HomePage;


public class Tests{

  WebDriver driver;
  HomePage homepage;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        homepage=new HomePage(driver);
    }

    @Test
    public void checkPrice(){
        homepage.navigateToHomePage();
        homepage.clickGetPaid();
        DocumentPage documentPage=new DocumentPage(driver);
        String price=documentPage.getPrice();
        Assert.assertEquals(price,"Free");


    }

    @AfterClass
    public void tearDown(){
        //   driver.quit();
    }




}
