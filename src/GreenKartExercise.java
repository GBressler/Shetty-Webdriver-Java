import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartExercise {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GB.GAYITA\\Desktop\\Workspace\\Drivers\\Chrome99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		//Add a new item whenever needed
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Pumpkin", "Mango"};
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
				
				for(int i = 0; i < products.size(); i++) {
					//Get only the item name and toss out the rest
					String[] name = products.get(i).getText().split("-");
					//checking all times have been run
					System.out.println("split " + i);
					//name[0] = Brocolli
					String formattedName = name[0].trim();
					//check if extracted name is present in Array list, to do so convert Array to ArrayList
					List shoppingList = Arrays.asList(itemsNeeded);
					
					//int allItems = itemsNeeded.length;
					int allItems = 0;
					if(shoppingList.contains(formattedName)) {
						//click add to cart
						System.out.println("Add item " + i + " to cart");
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						//if you have all the needed items, stop iterating
						if(allItems==itemsNeeded.length)
						{
							break;
						}
					}
					
				}
	}
}
