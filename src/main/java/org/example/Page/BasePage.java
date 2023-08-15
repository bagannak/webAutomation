package org.example.Page;

import org.example.Page.PageWaits;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected PageWaits waits;
    protected WebDriver webDriver;
    PageActions pageActions;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.waits = new PageWaits(webDriver);
        this.pageActions = new PageActions(webDriver);
    }
}
