
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase02 {

	//with valid credentials 
	public void testCase2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Login.login("abc150@gmail.com", "Password123",driver);
		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		String url = driver.findElement(By.id("toast-container")).getText();
		System.out.println(url);
		sa.assertEquals(url, "Login Successfully");
		driver.close();
	}
	
	//Invalid Credentials
	public void testCase201() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Login.login("abc150@gmail.com", "Paword123",driver);
		SoftAssert sa = new SoftAssert();
		Thread.sleep(1000);
		String url = driver.findElement(By.id("toast-container")).getText();
		System.out.println(url);
		sa.assertEquals(url, "Incorrect email or password.");
		driver.close();
		
	}
}

