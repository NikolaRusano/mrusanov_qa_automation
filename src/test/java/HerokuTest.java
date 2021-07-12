import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HerokuTest {

    @Test
    public void changeCheckBox() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Webdrivers/geckodriver");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://the-internet.herokuapp.com/checkboxes");
        //Thread.sleep(3000);
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(webDriver,30);

        webDriver.findElement(By.xpath("//input[1]")).click();
        boolean isSelectedchckbx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[1]"))).isSelected();
        System.out.println("The checkbox is selected: " + isSelectedchckbx);
        webDriver.quit();

        //TO DO add a test which goes to http://the-internet.herokuapp.com/checkboxes URL and check checkbox
        //Verify checkbox is checked in the test
    }

    @Test
    public void dynamicElement(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com/entry_ad");
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        webDriver.close();
        //webDriver.findElement(By.xpath("//p[normalize-space()='Close']")).;
        webDriver.findElement(By.xpath("//a[normalize-space()='click here']")).click();
        boolean ifTextDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='This is a modal window']"))).isDisplayed();
        System.out.println("The checkbox is selected: " + ifTextDisplayed);



        //TO DO add a test which goes to http://the-internet.herokuapp.com/entry_ad URL and closes the pop-up
        //then it clicks `click here.` link and checks `THIS IS A MODAL WINDOW` text is displayed on the page
    }

    @Test
    public void testInvalidLogin(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/login URL and fills in incorrect details
        //then it clicks `Login` button
        //Here should be a check on error message is displayed on the page
    }

    @Test
    public void testValidLogin(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/login URL and fills in correct details
        //then it clicks `Login` button
        //Here should be a check that user is logged in and a new content is displayed
    }

    @Test
    public void testDynamicLoadingElement(){
        //TO DO add a test which goes to  http://the-internet.herokuapp.com/dynamic_loading/1 URL and
        //clicks start button
        //Here should be a check that Hello World text is displayed
    }

    @Test
    public void testDownloadFile(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/jqueryui/menu URL and
        //goes to Enabled-Download-Excel and clicks it
        //verify that the file is downloaded
    }
}
