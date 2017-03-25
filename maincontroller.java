package pageobject;
import java.util.concurrent.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import pageobject.loginpage;
import pageobject.homepage;

public class maincontroller {
	private static FirefoxDriver driver;
	@BeforeClass
	public static void openBrowser(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SANDEEP BHATULA\\Documents\\geckodriver-v0.14.0-win64\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void opengit(){
		System.out.println("Starting test");
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage h=new homepage();
		h.clicksign(driver);
		loginpage l=new loginpage();
		l.signin(driver);
	}
	
}
