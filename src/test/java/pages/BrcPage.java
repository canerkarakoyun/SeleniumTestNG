package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brcLogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement userEmail;

    @FindBy (xpath = "//*[@class='w-100 btn btn-primary btn-lg']")
    public WebElement ContinueReservationButton;


}
