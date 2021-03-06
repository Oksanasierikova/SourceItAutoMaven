package org.L3;

import org.L3.Pages.ItemsCatalog;
import org.L3.Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class MyNewTest extends BaseWebDriverTest {

    public static final String INPUT_SELECTOR = "//input[contains(@class,'rz-header-search-input-text')]";//xpath
    public static final String FILTER_SELECTOR = "a.filter-active-i-link";
    public static final String IPHONE_ITEM = "//div[contains(@class,'g-i-tile g-i-tile-catalog')]" +
            "//div[contains(@class,'g-i-tile-i-title')]/a[contains(text(),'Apple iPhone 7 128GB Jet Black')]";
    //xpath

    @Test(groups = "PC")
    public void testSite() {

        //Search for Iphone
        /*driver.findElement(By.xpath(INPUT_SELECTOR))
                .sendKeys("Iphone"+ Keys.ENTER);*/
        LandingPage page = new LandingPage(driver);
        page.search("Iphone");
         ItemsCatalog catalog = page.getItemsCatalog();
         LandingPage itemPage = catalog.goToCategory(""); //this was added in L3
        wait.until(ExpectedConditions.textToBe(By.cssSelector(FILTER_SELECTOR), "Apple"));
        /*String result = driver.findElement(By.cssSelector(FILTER_SELECTOR)).getText();
        //Verify filter is enabled
        assert result.equals("Apple");*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INPUT_SELECTOR)))
                .clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INPUT_SELECTOR)))
                .sendKeys("Samsung");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("rz-search-button")))
                .click();
        wait.until(ExpectedConditions.textToBe(By.cssSelector(FILTER_SELECTOR), "Samsung"));
        System.out.println("Test Done");
    }

    @Test
    public void testRozetka(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INPUT_SELECTOR)))
                .clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INPUT_SELECTOR)))
                .sendKeys("iphone 7 32gb");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("rz-search-button")))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IPHONE_ITEM))).click();
        try {
            Thread.sleep(5000);
        } catch (Exception e){

        }
        assert driver.getCurrentUrl().equals("http://rozetka.com.ua/apple_iphone_7_128gb_jet_black/p11241577/");
    }

    @Test
    public void testGoToCategory(){
        LandingPage page = new LandingPage(driver);
        page.search("Iphone");
        wait.until(ExpectedConditions.textToBe(By.cssSelector(FILTER_SELECTOR), "Компьютеры и ноутбуки"));
    }
}