import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome97\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Hello world!");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("submit")).click();
		//need a wait - implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String error = driver.findElement(By.cssSelector("p.error")).getText().toString();
		System.out.println(error);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mr. Fangs");
		System.out.println("email");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fangs@fake.com");
		//String email = 
				driver.findElement(By.cssSelector("input[placeholder='Email']")).getText().toString();
		//System.out.println(email);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("another@email.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		email.sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne"));
		//driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
