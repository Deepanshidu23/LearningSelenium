package org.deepanshi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.Arrays;


import java.time.Duration;

public class Add_to_cart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        addItems(driver,itemsNeeded);

    }
    public static  void addItems(WebDriver driver,String[] itemsNeeded)
    {

        int j=0;

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++)

        {
            String[] name=products.get(i).getText().split("-");

            String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName))

            {
                j++;

//click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeeded.length)

                {

                    break;

                }

            }

        }

    }



}



