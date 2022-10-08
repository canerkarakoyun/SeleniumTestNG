package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"Java"},{"Selenium"}, {"Samsung"},{"iphone"}};
    }

    @Test (dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {
        // Amazona gidelim
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        // Java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        //sonuclarin aradigimiz kelimeleri icerdigini test edelim
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
        // sayfayi kapatalim

    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();

    }
}
