package MarchBatchPracticeSelenium.MarchPractic;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngExample {

	@Test
	public void testCase_dependency() {
		System.out.println("TestCase_dependency...");
	}

	
	@Test(priority=2, enabled=false)
	public void testCase1() {
		System.out.println("TestCase1...");
	}
	
	@Test(priority=1)
	public void testCase2() {
		System.out.println("TestCase2...");
	}
	
	@Test(priority=0, dependsOnMethods="testCase_dependency" )
	public void testCase3() {
		System.out.println("TestCase3...");
	}
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite...");
	}
	
	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("Before Test...");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("After Test..");
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("Before Class...");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("After Class..");
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method...");
	}
	
	@AfterMethod
	public void amethod() {
		System.out.println("After Method..");
	}

}
