package org.deepanshi;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Airasia {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='currency-dropdown']/select")));
            dropdown.selectByIndex(3);
            System.out.println(dropdown.getFirstSelectedOption().getText());


        }
    }

