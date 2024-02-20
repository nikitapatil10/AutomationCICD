
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase01 {
	@Test
	public void testcase01() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		Register.clickRegisterButton(driver);
		String currentUrl = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, "https://rahulshettyacademy.com/client/auth/register");
		Register.registerUser(driver,"User122434", "Name","8787898762", "abcdd15000@gmail.com", "Password123");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//div[@class='login-wrapper my-auto p-5 ng-star-inserted']/h1")).getText();
		
		sa.assertEquals(text,"Account Created Successfully");
		driver.close();
	}

}
