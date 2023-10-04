package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	@Test
    public void LaunchBrowser() {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"), "Title does not match");
        driver.quit();
    }

}
