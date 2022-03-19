import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Your Name Here";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//get id via Css
		WebElement nameField = driver.findElement(By.cssSelector("[id='name']"));
		nameField.sendKeys(name);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		//switch to Alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

}
