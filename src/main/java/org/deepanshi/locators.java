package org.deepanshi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        WebElement username = driver.findElement(By.id("inputUsername"));
        username.sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("helloo1234");
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.className("signInBtn")).click();

        WebElement login_btn = driver.findElement(By.xpath("//button"));
        login_btn.click();
    }
}
