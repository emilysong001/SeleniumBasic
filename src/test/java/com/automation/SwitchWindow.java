package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class SwitchWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");

        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        //WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        //WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));

        search.sendKeys("laptop");
        searchBtn.click();

        ////ul[@class='srp-results srp-list clearfix']/li[@data-viewport] 60
        ////ul[@class='srp-results srp-list clearfix']/li[@data-viewport]//a[@class='s-item__link'] 60
        WebElement firstLink = driver.findElement(By.xpath("//ul[@class='srp-results srp-list clearfix']/li[@data-viewport]//a[@class='s-item__link']"));
        //WebElement firstLink = driver.findElement(By.xpath("//li[@id='item1af190d1c5']/div/div/a"));
        firstLink.click();
        // Get current window id (window handle)
        String originalWindow = driver.getWindowHandle();

        Set<String> listOfWindow = driver.getWindowHandles();

        // Switch to newly open window by going over all open window and comparing if it is NOT current window then
        // switch on that (new window)
        for (String window : listOfWindow) {
            if (!window.equalsIgnoreCase(originalWindow)) {
                driver.switchTo().window(window); // switchTo() method used to switch to window
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement price = driver.findElement(By.xpath("//span[@itemprop='price']/span"));
        System.out.println(price.getText());

        // Return to the original window
        driver.switchTo().window(originalWindow);
        //driver.quit();

    }
}
