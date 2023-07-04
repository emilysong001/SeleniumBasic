package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        //WebElement electronics = driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li/a[text()='Electronics']"));
        WebElement electronics = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement appleLink = driver.findElement(By.xpath("//li/a[text()='Apple iPhone']"));

        Actions action = new Actions(driver);
        //hoverover on electronics
        action.moveToElement(electronics).pause(1000).click(appleLink).build().perform();


    }
}
