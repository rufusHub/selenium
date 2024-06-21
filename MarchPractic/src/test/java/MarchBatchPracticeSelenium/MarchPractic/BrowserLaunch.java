package MarchBatchPracticeSelenium.MarchPractic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {

	ChromeDriver driver = new ChromeDriver();
	
	public void a_testCase_init() throws InterruptedException {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
	}
	
	@Before
	public void b_testCase_login() throws AWTException, InterruptedException {
		
		this.a_testCase_init();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kupastas0001@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kupastas0002TTT!!!");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	

	@Test
	public void c_testCase_request() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("cinthia moreno");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@href,'cinthia%20moreno&__epa')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/profile.php?id=100092734921895']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Agregar a amigos']")).click();
		
	}
	
	@Test
	public void d_testCase_sms() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Buscar en Messenger']")).sendKeys("camber bermudez caro");
		Thread.sleep(3000);
		driver.findElement(By.id("100051747342163")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Enviar mensaje']")).sendKeys("test message");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'para enviar')]")).click();
		
	}
	
	@After
	public void e_testCase_logout() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@data-visualcompletion='ignore-dynamic' and @data-nocookies='true']")).click();
//		driver.findElement(By.xpath("//span[start-with(@id, ':r') and normalize-space()='Cerrar sesión']")).click();
		this.f_testCase_closure();
	}
	
	public void f_testCase_closure() {
		driver.close();
}
	
	@Ignore
	@Test
	public void testCase_createAccount() throws InterruptedException {

		WebElement create = driver.findElement(By.linkText("Create new account"));
		create.click();
		
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Rodrigo");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Bermúdez");
		
		WebElement MobNumEmail = driver.findElement(By.name("reg_email__"));
		MobNumEmail.sendKeys("rbermudez24@gmail.com");
		
		WebElement reEntEmail = driver.findElement(By.name("reg_email_confirmation__"));
		reEntEmail.sendKeys("rbermudez24@gmail.com");
		
		WebElement newPass = driver.findElement(By.id("password_step_input"));
		newPass.sendKeys("Rodrigo");
		
//		selectByValue
		Select birthdayMonth = new Select(driver.findElement(By.name("birthday_month")));
		birthdayMonth.selectByValue("8");
		
//		selectByVisibleText
//		Select birthdayMonth = new Select(driver.findElement(By.id("month")));
//		birthdayMonth.selectByVisibleText("Aug");
		
//		selectByIndex
//		Select birthdayMonth = new Select(driver.findElement(By.id("month")));
//		birthdayMonth.selectByIndex(7);
		
		
		Select birthdayDay = new Select(driver.findElement(By.name("birthday_day")));
		birthdayDay.selectByValue("24");
		
		Select birthdayYear = new Select(driver.findElement(By.name("birthday_year")));
		birthdayYear.selectByValue("1966");
		
		WebElement gender = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//input[@value='2']"));
		gender.click();
		
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();

	}
		
}



/* Before class..		@BeforeClass
 * Before annotation	@Before
 * First test case		@Test
 * closure				@After
 * Before annotation	@Before
 * Second test case		@Test
 * closure				@After
 * After class..		@AfterClass
 * */

//The test case won´t execute.
//@Ignore		
//@Test


//String txt = driver.findElement(By.xpath("//div[@class='x13rtm0m x87ps6o x1lku1pv x1a2a7pz x9f619 x3nfvp2 xdt5ytf xl56j7k x1n2onr6 xh8yej3']")).getAttribute("aria-label");

