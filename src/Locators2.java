import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String name = "Greg";
		String password = getPassword(driver);

		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("#chkboxOne"));
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("Here's your message: " + text);
		Assert.assertEquals(text, "You are successfully logged in.");
		String greeting = driver.findElement(By.cssSelector("div.login-container h2")).getText();
		Assert.assertEquals(greeting, "Hello "+ name +",");
		System.out.println(greeting);
		 driver.findElement(By.cssSelector("button.logout-btn")).click();
		 

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		 String[] passwordArray = passwordText.split("'");
		 String[] passwordArray2 = passwordArray[1].split("'");
		 String password = passwordArray[1].split("'")[0];
		 return password;
		 
		 //0 index => Please use temporary password
		 //1 index => rahulshettyacademy' to Login.
		 
		//0 index => rahulshettyacademy
		 //1 index =>  to Login.
	}

}
