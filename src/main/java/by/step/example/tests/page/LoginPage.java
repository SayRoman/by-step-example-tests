package by.step.example.tests.page;

import by.step.example.tests.block.LoginBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage{
    LoginBlock loginBlock = new LoginBlock(driver);

    public LoginPage (WebDriver driver){

    }
}
