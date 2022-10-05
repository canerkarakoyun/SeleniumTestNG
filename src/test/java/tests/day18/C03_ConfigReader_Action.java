package tests.day18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader_Action {
    @Test
    public void test01() {
        // Bir Class olustur : PositiveTest
        // 2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git
        // login butonuna bas
        HmcPage hmcPage=new HmcPage();
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage.login.click();
        // test data username: manager ,  test data password : Manager1!
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcUser"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
        Driver.closeDriver();

    }
}
