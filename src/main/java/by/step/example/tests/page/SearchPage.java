package by.step.example.tests.page;

import by.step.example.tests.block.SearchBlock;
import org.openqa.selenium.WebDriver;

public class SearchPage extends  BasePage{

    private SearchBlock searchBlock = new SearchBlock(driver);

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchBlock getYahooPage() {
        return searchBlock;
    }

}
