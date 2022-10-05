package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScrennShotReuableMethod {
    @Test
    public void test01() throws IOException {
        // Hepsiburada sayfasina git
        Driver.getDriver().get("https://hepsiburada.com");
        // sayfanin ekran resmini alin
        ReusableMethods.getScreenshot("hepsiburada");
        // sayfayi kapat
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        // Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        // Nutella aratiniz
        AmazonPage amznPage=new AmazonPage();
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        // Arama sonuc yazisi WebElementi'nin resmini aliniz
        ReusableMethods.getScreenshotWebElement("nutellasearch",amznPage.aramaSonucElementi);
        // Sayfayi kapatiniz
        Driver.closeDriver();
    }
}
