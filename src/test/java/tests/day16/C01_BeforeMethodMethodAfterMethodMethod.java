package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodMethodAfterMethodMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void techProTesti() {
        driver.get("https://techproeducation.com");

    }
}
