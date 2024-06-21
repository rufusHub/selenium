package MarchBatchPracticeSelenium.MarchPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makeMyTrip_15jun {

ChromeDriver driver = new ChromeDriver();
Actions action = new Actions(driver);
	
	public void a_testCase_init() throws InterruptedException {
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
	}
	
	public void closePopup() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		
	}
	
	public void fromMenu() {
		driver.findElement(By.id("fromCity")).click();
		
	}
	
	public void arrowDown() throws InterruptedException {
		for(int i=1; i<=10; i++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
	}
	
	public void enterKey() {
		action.sendKeys(Keys.ENTER).perform();
		
	}
	public static void main(String[] args) throws InterruptedException {
		makeMyTrip_15jun obj = new makeMyTrip_15jun();
		obj.a_testCase_init();
		obj.closePopup();
		obj.fromMenu();
		obj.arrowDown();
		obj.enterKey();
	}
	
}
