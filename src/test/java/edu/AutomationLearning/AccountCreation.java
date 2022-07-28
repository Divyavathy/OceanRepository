package edu.AutomationLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTestCase {

  @Test

  public void TestCase() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    // driver.findElement(By.linkText("Sign in")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("divy2siva@gmail.com");
    driver.findElement(By.id("passwd")).sendKeys("divy101091");
    driver.findElement(By.id("SubmitLogin")).click();

    String loginUSerName = driver.findElement(By.className("account")).getText();
    System.out.println(loginUSerName);

    if (loginUSerName.equalsIgnoreCase("Divya S")) {
      System.out.println("logged in Success");
    } else {
      System.out.println("logged in with Wrong User");

    }

    Boolean signOutButton = driver.findElement(By.className("logout")).isDisplayed();
    System.out.println("signOutButton");

    if (Boolean.TRUE) {
      System.out.println("Passed");
    } else {
      System.out.println("Failed");

    }

  }
}