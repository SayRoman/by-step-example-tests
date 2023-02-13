package by.step.example.tests.page;

import by.step.example.tests.block.HomeBlock;
import by.step.example.tests.block.SearchBlock;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

    private HomeBlock homeBlock = new HomeBlock(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomeBlock getBashOrgPage() {
        return homeBlock;
    }
}
