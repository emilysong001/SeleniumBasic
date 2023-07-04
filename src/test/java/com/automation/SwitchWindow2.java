package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SwitchWindow2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");

        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        search.sendKeys("laptop");
        searchBtn.click();

        ////ul[@class='srp-results srp-list clearfix']/li[@data-viewport] 60
        ////ul[@class='srp-results srp-list clearfix']/li[@data-viewport]//a[@class='s-item__link'] 60
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='srp-results srp-list clearfix']/li[@data-viewport]//a[@class='s-item__link']"));
        for (WebElement link:links) {
            link.click();
            String originalWindow = driver.getWindowHandle();
            Set<String> listOfWindow = driver.getWindowHandles();
            for (String window : listOfWindow) {
                if (!window.equalsIgnoreCase(originalWindow)) {
                    driver.switchTo().window(window);
                }
            }
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            WebElement price = driver.findElement(By.xpath("//span[@itemprop='price']/span"));
            System.out.println(price.getText());
            driver.close();
            driver.switchTo().window(originalWindow);
        }





    }
}
