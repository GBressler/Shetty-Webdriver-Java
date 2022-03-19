import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		//Calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		
		//Number of Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
