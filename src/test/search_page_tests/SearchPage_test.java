package search_page_tests;

import by.step.example.tests.base.BaseUiTestsClass;
import by.step.example.tests.service.SearchFieldService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class SearchPage_test extends BaseUiTestsClass {

    private SearchFieldService searchService;

    @BeforeEach
    public void openLoginPage () throws InterruptedException {
        driver.navigate().to("https://www.yahoo.com/");
    }

    @Test
    public void verifyBarInputVisibility () {
        //Given
        searchService = new SearchFieldService(driver);

        //Then
        Assertions.assertEquals(true, searchService.getSearchPage().getYahooPage().search_field.isDisplayed());

    }

    @Test
    public void verifyInputParameters () {
        //Given
        String initialTextString = "У меня всё получиться";


        searchService = new SearchFieldService(driver);
        searchService.getSearchPage().getYahooPage().search_field.sendKeys(initialTextString);


        //When
        searchService.getSearchPage().getYahooPage().search_field.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

        //Then
        //Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);
    }


}
