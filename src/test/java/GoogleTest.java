import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    @Test
    public void openGoogleTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement element = driver.findElement(By.name("btnK"));
        assert "Пошук Google".equals(element.getAttribute("value"));
    }
}