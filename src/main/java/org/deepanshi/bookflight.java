package org.deepanshi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class bookflight {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://spicejet.com");
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

        Thread.sleep(2000L);
        int i=1;
        while(i<5) {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();


        /*for(int i=1;i<5;i++)

        {

            driver.findElement(By.id("hrefIncAdt")).click();

        }

         */


//        WebElement seats = driver.findElement(By.id("divpaxinfo"));
//        String noofseats = seats.getText();
//        Assert.assertEquals(noofseats, "5 Adults");
//
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



    }
}

