package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.*;

public class homepage {
	
		
	public void clicksign(FirefoxDriver driver){
		
		driver.findElementByXPath("//a[contains(text(),'Sign in')]").click();
	
	}

}
