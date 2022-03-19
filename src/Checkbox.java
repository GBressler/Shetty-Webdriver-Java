import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Find all checkboxes.  First find common attribute, In this case "type=checkbox"
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//Mark checkbox & verify
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		//driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//This is probably preferred - 1 space PArent Child.  Looks for Child only within Parent
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
		//This is also works and is easier
		//driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		//This is probably preferred - 1 space Parent Child.  Looks for Child only within Parent
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		//This is also works and is easier
		//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
	}

}
