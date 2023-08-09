package org.example.Page;

import org.example.Module.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
//    public void search(String searchItem) {
//        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/summary/span")).click();
//        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).sendKeys(searchItem);
//        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button")).click();
//    }

    By searchIcon = By.cssSelector("summary[aria-label='Search']");
    By searchBar = By.id("Search-In-Modal");
    //By searchResults = By.cssSelector("li[id^='predictive-search-option'] a");
    By searchResults=By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button");
    // Scoped Element
    By productName = By.cssSelector(".predictive-search__item-heading");

//    public HomePage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//    }

    public HomePage search(String searchItem) {
        webDriver.findElement(searchIcon).click();
        webDriver.findElement(searchBar).sendKeys(searchItem);
        webDriver.findElement(searchResults).click();
        return this;
    }

    public List<Item> getSearchItems() {
        List<WebElement> elements = webDriver.findElements(searchResults);
        List<Item> items = new ArrayList<>();
        for(WebElement element : elements) {
            String name = element.findElement(productName).getText();
            Item item = new Item();
            item.setName(name);
            items.add(item);
        }
        return items;
    }

}
