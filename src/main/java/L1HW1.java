import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Created by P-C on 1/12/2017.
 */
public class L1HW1 {
    @Test
    public static void test1() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().setSize(new Dimension(1280, 1024));
        driver1.get("http://rozetka.com.ua/");
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver1.findElement(By.cssSelector(".rz-header-search-input-text"))
                .sendKeys("Iphone");
        WebElement searchButton = driver1.findElement(By.cssSelector(".btn-link-i"));
        searchButton.click();
        String result = driver1.findElement(By.cssSelector("a.filter-active-i-link")).getText();
        assert result.equals("Apple");
        System.out.println("Test done");
        driver1.quit();
    }

    @Test
    public static void test2() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", path + "/src/main/resources/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().setSize(new Dimension(1280, 1024));
        driver2.get("http://rozetka.com.ua/");
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver2.findElement(By.cssSelector(".rz-header-search-input-text"))
                .sendKeys("Iphone"
                        // + Keys.ENTER
                );
        WebElement searchButton = driver2.findElement(By.cssSelector(".btn-link-i"));
        searchButton.click();
        String result = driver2.findElement(By.cssSelector("a.filter-active-i-link")).getText();
        assert result.equals("Apple");
        System.out.println("Test done");
        driver2.quit();
    }
}
