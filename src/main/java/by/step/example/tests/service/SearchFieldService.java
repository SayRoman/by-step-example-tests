package by.step.example.tests.service;

import by.step.example.tests.page.SearchPage;
import org.openqa.selenium.WebDriver;

public class SearchFieldService extends BaseService{

    private SearchPage searchPage = new SearchPage(driver);

    public SearchFieldService(WebDriver driver) {
        super(driver);
    }

    public SearchPage getSearchPage() {
        return searchPage;
    }
}
