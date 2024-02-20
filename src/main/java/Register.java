

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public static void clickRegisterButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	public static void registerUser(WebDriver driver,String firstName,String lastName,String phoneNumber,String emailId,String password)
	{
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("userEmail")).sendKeys(emailId);
		driver.findElement(By.id("userMobile")).sendKeys(phoneNumber);
		WebElement selectBox = driver.findElement(By.xpath("//form/div[3]/div[1]/select"));
		Select sc = new Select(selectBox);
		sc.selectByValue("3: Engineer");
		driver.findElement(By.xpath("//span[text()='Female']/preceding-sibling::input")).click();
		driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//form/div[5]/div[1]/input")).click();
		driver.findElement(By.id("login")).click();
		
	}

}
