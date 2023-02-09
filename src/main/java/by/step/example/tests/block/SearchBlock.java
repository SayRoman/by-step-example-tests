package by.step.example.tests.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBlock extends BaseBlock {

    public SearchBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ybar-sbq")
    public WebElement search_field;

    @FindBy(id="ybar-search")
    public WebElement button_submit;


}
