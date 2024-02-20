


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static void  login(String userName,String password,WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys(userName);
		driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.id("login")).click();	
		
	}
}

