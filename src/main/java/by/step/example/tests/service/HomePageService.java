package by.step.example.tests.service;

import by.step.example.tests.page.HomePage;
import by.step.example.tests.page.SearchPage;
import org.openqa.selenium.WebDriver;

public class HomePageService extends BaseService{

    private HomePage homePage = new HomePage(driver);

    public HomePageService(WebDriver driver) {
        super(driver);
    }

    public HomePage getSearchPage() {
        return homePage;
    }
}
