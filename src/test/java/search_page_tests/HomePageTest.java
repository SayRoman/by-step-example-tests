package search_page_tests;

import by.step.example.tests.base.BaseUiTestsClass;
import by.step.example.tests.service.HomePageService;
import by.step.example.tests.service.SearchFieldService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class HomePageTest extends BaseUiTestsClass {

    private HomePageService homeService;

    @BeforeEach
    public void openHomePage () throws InterruptedException {
        driver.navigate().to("http://bashorg.org/");
    }

    @Test
    public void verifyLoginFieldInputVisibility () {
        //Given
        homeService = new HomePageService(driver);

        //Then
        Assertions.assertEquals(true, homeService.getSearchPage().getBashOrgPage().login_name.isDisplayed());

    }

    @Test
    public void verifyInputParameters () {
        //Given
        String initialTextString = "У меня всё получиться";


        homeService = new HomePageService(driver);
        homeService.getSearchPage().getBashOrgPage().login_name.sendKeys(initialTextString);


        //When
        homeService.getSearchPage().getBashOrgPage().login_name.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

        //Then
        //Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);
    }
}
