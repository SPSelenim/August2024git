package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.pomHome;

public class testHome {

	public WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	@Test
	public void f() {
		try {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			pomHome home = new pomHome(driver);
			home.sendDataInFirstName("ppp");
			home.sendDataInLastName("p1p1p1");
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
