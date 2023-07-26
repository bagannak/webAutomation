import org.example.Page.LauncherPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Page.HomePage;
import org.example.Module.Item;

import java.util.List;

public class SearchTest {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        WebDriver webdriver = new ChromeDriver();
        //Arrange
        String searchItem = "Product";
        String searchKey="Product";
//        WebDriver webdriver=null;
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert
        Assert.assertEquals( searchItems.size(),4);

        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));

    }

}
