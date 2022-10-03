package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[@class='nav-link'])[7]")
    public WebElement login;

    @FindBy (xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy (xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy (xpath = "//*[@id='btnSubmit']")
    public WebElement logInButton;

    @FindBy (xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement listOfUsers;

    @FindBy (xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy (xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy (xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoom;

    @FindBy (xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//*[text()='RoomReservation was inserted successfully']")
    public WebElement roomReservationText;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement okButton;

}
