package org.project2;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project2{
	WebDriver driver;
	
	@BeforeClass
	private void tc1() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	private void tc2() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.name("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("abcde");
		driver.findElement(By.id("last-name")).sendKeys("xyz");
		driver.findElement(By.id("postal-code")).sendKeys("000000");
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.id("finish")).click();
		WebElement text = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		String text2 = text.getText();
		System.out.println(text2);
		driver.findElement(By.name("back-to-products")).click();
	}
	@AfterClass
	private void tc3() {
		driver.quit();

	}
	
}
