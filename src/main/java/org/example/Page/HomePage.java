package org.example.Page;

import org.example.Module.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    By searchIcon = By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/details-modal/details/summary");
    By searchBar = By.id("Search-In-Modal");
    By searchResults = By.cssSelector("li[id^='predictive-search-option'] a");
    By productName = By.cssSelector(".predictive-search__item-heading h5");

    public HomePage (WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage search(String searchItem) {
        pageActions.click(searchIcon);
        pageActions.type(searchBar, searchItem);
        return this;
    }

    public List<Item> getSearchItems() {
        List<WebElement> elements = waits.waitUntilAllElementsAreVisible(searchResults);
        List<Item> items = new ArrayList<>();
        for (WebElement element: elements) {
            String name = element.findElement(productName).getText();
            Item item = new Item();
            item.setName(name);
            items.add(item);
        }
        return items;
    }


}