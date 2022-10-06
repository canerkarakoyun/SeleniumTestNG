package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

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
    public void test01() {
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // -login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.brcLogin.click();

        // -test data user email: customer@bluerentalcars.com ,
        brcPage.userEmail.sendKeys(ConfigReader.getProperty("userEmail"));

        // -test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("pass"))
                .sendKeys(Keys.ENTER)
                .perform();

        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.ContinueReservationButton.isDisplayed());
    }
}
