package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_RaporluTest extends TestBaseRapor {
    /*

    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

     */

    @Test
    public void test01() throws IOException {
        extentTest=extentReports.createTest("Pozitif Test", "Gecerli kullanici adi ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue Rent a Car sitesine girildi");

        // -login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.brcLogin.click();
        extentTest.info("Login butonuna basildi");

        // -test data user email: customer@bluerentalcars.com ,
        brcPage.userEmail.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("Kullanici adi girildi");

        // -test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("pass"))
                .sendKeys(Keys.ENTER)
                .perform();
        extentTest.info("Kullanici sifresi girildi");
        extentTest.info("Ikinci kez login butonuna basildi");

        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.ContinueReservationButton.isDisplayed());
        extentTest.pass("Sayfaya basarili sekilde giris yapildi");

    }
}
