import org.example.Page.LauncherPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Page.HomePage;
import org.example.Module.Item;

import java.util.List;

public class SearchTest {
    @Test
    public void verifySearchUnavailableProduct() {
        // Arrange
        String searchItem = "Jeans";
        String searchKey = "Jeans";
        WebDriver webDriver = new ChromeDriver(); //Dummy WebDriver declaration
        LauncherPage launcherPage = new LauncherPage(webDriver);
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webDriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert
        //Assert.assertEquals(4, searchItems.size());
        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));
    }



}
