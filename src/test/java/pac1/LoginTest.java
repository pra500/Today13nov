package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	// url test p
	// title test p
	// home test f

	WebDriver driver;

	@Test
	public void urlTest() {

		String url = "https://practicetestautomation.com/practice-test-login/";

		String pageurl = driver.getCurrentUrl();

		Assert.assertEquals(url, pageurl);

	}

	@Test
	public void titleTest() {

		String url = "Test Login | Practice Test Automation";

		String pagetitle = driver.getTitle();

		Assert.assertEquals(url, pagetitle);

	}

	@Test
	public void homeTest() {

		boolean b = driver.findElement(By.xpath("//a[normalize-space()='Homee']")).isDisplayed();

		Assert.assertTrue(b);

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
