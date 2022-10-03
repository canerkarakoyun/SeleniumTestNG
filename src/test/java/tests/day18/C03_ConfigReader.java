package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {
        // Bir Class olustur : PositiveTest
        // 2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git  login butonuna bas
        HmcPage hmcPage=new HmcPage();
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage.login.click();
        // test data username: manager ,  test data password : Manager1!
                // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hmcPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        hmcPage.password.sendKeys(ConfigReader.getProperty("password"));
        hmcPage.logInButton.click();
        Assert.assertTrue(hmcPage.listOfUsers.isDisplayed());
    }
}
