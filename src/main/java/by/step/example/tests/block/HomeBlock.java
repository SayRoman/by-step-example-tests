package by.step.example.tests.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeBlock extends BaseBlock{

    public HomeBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="login_name")
    public WebElement login_name;

    @FindBy(id="ybar-search")
    public WebElement button_submit;

}

