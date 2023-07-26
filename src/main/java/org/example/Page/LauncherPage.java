package org.example.Page;

import org.openqa.selenium.WebDriver;

public class LauncherPage {
    WebDriver webDriver;
    public LauncherPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    public String navigateTo(String url){
        return  url;
    }
}
