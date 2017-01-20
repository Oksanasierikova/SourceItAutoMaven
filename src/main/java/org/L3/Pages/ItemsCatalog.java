package org.L3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ItemsCatalog extends LandingPage {

    public ItemsCatalog(WebDriver driver) {
        super(driver);
        /*PageFactory.initElements(driver,this);*/
    }
/*     Так делать не надо
    @FindBy(xpath = "//ok")
    WebElement ok;*/

    public ItemsCatalog selectCategory(String category){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("fat_menu_btn"))).build().perform();
        return this;
    }

    public LandingPage goToCategory(String category){
        selectCategory(category);
        return new LandingPage(driver);
    }


}
