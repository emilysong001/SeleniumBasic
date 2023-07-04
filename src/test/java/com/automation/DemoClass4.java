package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoClass4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("Laptop");
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
        searchBtn.click();
        ////span[@class='s-item__price']

        List<WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));
        for (int i = 0; i < listOfPrice.size(); i++) {
            System.out.println(listOfPrice.get(i).getText());
        }


        WebElement signLink = driver.findElement(By.xpath("//a[text()='Sign in']"));
        //li/span/a[text()='Sign in']
        //li[@id='gh-eb-u']/span/a[text()='Sign in']
        //a[text()='Watchlist']
        //a[contains(@class,'watchlist-menu')]

        ////p[contains(text(),'Username :')]

        ////p[text() = contains (., 'Username')]




    }
}