package org.deepanshi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
           driver.get("https://rahulshettyacademy.com");
           System.out.println(driver.getTitle());
           driver.getCurrentUrl();
           driver.close();
           driver.quit();


    }
}