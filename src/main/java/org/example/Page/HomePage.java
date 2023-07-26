package org.example.Page;

import org.example.Module.Item;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private List<Item> items;
    WebDriver webDriver;
    public HomePage(WebDriver webDriver){
        items=new ArrayList<>();
        this.webDriver=webDriver;
    }
    public void search(String searchTerm){

    }
    public List<Item> getSearchItems(){
        return  items;
    }
}
