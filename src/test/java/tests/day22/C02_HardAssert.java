package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseCross;

public class C02_HardAssert extends TestBaseCross {
    @Test (groups = "gp1")
    public void test01() {
        // Bir class oluşturun: DependsOnTest
        // https://www.amazon.com/ adresine gidin.
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        // Test : Amazon ana sayfaya gittiginizi test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        // Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        // aramanizin gerceklestigini Test edin
        WebElement searchResult=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(searchResult.getText().contains("Nutella"));
        // Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin

        // $16.83 oldugunu test edin
    }
}
