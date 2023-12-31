package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HandlingMultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.ebay.co.uk/");

        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        search.sendKeys("Phone");
        searchButton.click();

        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='srp-results srp-list clearfix']/li[@data-viewport]//a[@class='s-item__link']"));

        for(WebElement link : links) {

            link.click();

            // Get current window id (window handle)
            String originalWindow = driver.getWindowHandle();

            Set<String> listOfWindow = driver.getWindowHandles();

            // Switch to newly open window by going over all open window and comparing if it is NOT current window then
            // switch on that (new window)
            for (String window : listOfWindow) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window); // switchTo() method used to switch to window
                }
            }
            WebElement priceLoc = driver.findElement(By.xpath("//span[@itemprop='price']/span"));
            System.out.println(priceLoc.getText());
            driver.close();

            // Return to the original window
            driver.switchTo().window(originalWindow);
        }

    }
}
