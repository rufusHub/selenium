package MarchBatchPracticeSelenium.MarchPractic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook_15Jun {

	ChromeDriver driver = new ChromeDriver();
	
	public void a_testCase_init() throws InterruptedException {
		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();

	}
	
	
	// to select multiple elements
	public void multiple_elements () throws InterruptedException {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		List<WebElement> all = driver.findElements(By.xpath("//input[@data-type='text']"));
		for (WebElement element : all) {
			element.sendKeys("Rodrigo");
		}
	}
	
	// to send keys
	public void send_keys() throws InterruptedException {
		
		Actions ac = new Actions(driver);
		for(int i=1; i<=5; i++) {
			ac.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
		}
	}
	public void pressclickrelease() {
		WebElement forgotten = driver.findElement(By.linkText("Forgot password?"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(forgotten).keyUp(Keys.CONTROL).build().perform();
		String currentWindow = driver.getWindowHandle();
		System.out.println("Before switching URL is " + driver.getCurrentUrl());
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("total tabs " + allWindows.size());
		
		for (String window : allWindows) {
			driver.switchTo().window(window);
		}
		
		//If want to open a specific window number.
//		int cont=0;
//		for (String window : allWindows) {
//			cont++;
//			if (cont==3) {
//				driver.switchTo().window(window);
//				break;
//			}
//		}
		
		System.out.println("After switching URL is " + driver.getCurrentUrl());
//		driver.switchTo().window(currentWindow);
//		System.out.println("Finally URL is " + driver.getCurrentUrl());
		
	}
		
	
	
	public static void main(String[] args) throws InterruptedException {
		facebook_15Jun obj = new facebook_15Jun();
		obj.a_testCase_init();
//		obj.multiple_elements();
//		obj.send_keys();
		obj.pressclickrelease();
	}
}
