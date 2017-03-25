package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpage {

	public void signin(FirefoxDriver driver){
		driver.findElement(By.id("login_field")).sendKeys("");//ENter the username
		driver.findElement(By.id("password")).sendKeys("");//Enter password
		driver.findElementByXPath("//input[@value='Sign in']").click();
		
	}
}
