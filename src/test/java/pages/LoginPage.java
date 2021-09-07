package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //username
    @FindBy(id = "UserName")
    public WebElement username;
    //password
    @FindBy(id = "Password")
    public WebElement password;
    //login submit button
    @FindBy(id = "btnSubmit")
    public WebElement loginButton;
    //error message
    @FindBy(id = "divMessageResult")
    public WebElement errorMessage;
}
