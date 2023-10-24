package org.deepanshi;

import java.time.Duration;
//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://login.yahoo.com");
        //1.id
       // WebElement username = driver.findElement(By.id("login-username"));
        // username.sendKeys("deepanshi@yahoo.com");

        // WebElement nextbutton = driver.findElement(By.id("login-signin"));
        // nextbutton.click();
        //2.name
       // WebElement username = driver.findElement(By.name("username"));
        // username.sendKeys("deepu@yahoo.com");

        //Xpath:

        WebElement username=driver.findElement(By.xpath("//input[@id='login-username']"));
        username.sendKeys("vidisha@yahoo.com");

        WebElement nextbutton=driver.findElement(By.xpath("//input[@id='login-signin']"));
        username.click();




    }
}