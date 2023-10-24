package org.deepanshi;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imejob {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://imejob.com/");
        WebElement username = driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
        username.sendKeys("java");

        username.sendKeys(Keys.RETURN);

        WebElement search = driver.findElement(By.xpath("//div[@class='search-area']/button"));
        search.sendKeys(Keys.RETURN);


        List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='oppening']/div/h2"));
        for (WebElement item : jobs) {
            System.out.println(item.getText());
        }

    }

}


