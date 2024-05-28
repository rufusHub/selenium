package MarchBatchPracticeSelenium.MarchPractic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserLaunch2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/rufo/Documents/chromedriver-linux64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("/home/rufo/Documents/chrome-linux64/chrome");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		
	}
}
