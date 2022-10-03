package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {      // ilk islem constructor olusturmak
        PageFactory.initElements(Driver.getDriver(),this);   // ikinci islem PageFactory

    }

    @FindBy (xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy (xpath = "//*[@class='_9ay7']")
    public WebElement girisYapilamadi;

    @FindBy (xpath = "//*[text()='Not you?']")
    public WebElement notYou;

    @FindBy (xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;

}
