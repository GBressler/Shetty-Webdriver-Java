import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		int i = 1;
//		while(i < 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		}
		
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
