package org.deepanshi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Employeeform {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://imejob.com/");
        WebElement search;
        search = driver.findElement(By.className("ime-btn px-5 py-4 ime-btn-warning-soft "));
        search.sendKeys(Keys.RETURN);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("deepanshisingh281@gmail.com");

       // driver.findElement(By.name("password")).sendKeys("helloo1234");
        //driver.findElement(By.xpath("")).click();


    }
}
