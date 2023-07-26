package org.example.Page;

import org.openqa.selenium.WebDriver;

public class LauncherPage {
    WebDriver webDriver;
    public LauncherPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    public void navigateTo(String url){
       webDriver.get(url);
    }
}
