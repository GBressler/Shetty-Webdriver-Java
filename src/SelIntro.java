import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		// invoke browser
		//ChromeDriver driver = new ChromeDriver();
		//this is preferred
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome97\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Firefox\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.onion.com");
//		System.out.println(driver.getTitle());
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.onion.com");
		System.out.println(driver.getTitle());
		//driver.close();
		
		
	}

}
