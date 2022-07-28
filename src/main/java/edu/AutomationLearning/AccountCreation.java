package edu.AutomationLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountCreation {
	@Test
	public void createAccountAutomationpractise() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).sendKeys("divya@gmail.com");
    driver.findElement(By.id("psswd")).sendKeys("divya");


  
}

}
