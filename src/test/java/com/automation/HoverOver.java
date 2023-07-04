package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement sign = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(sign).keyUp(Keys.CONTROL).build().perform();


    }
}
