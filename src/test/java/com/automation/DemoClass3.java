package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        //WebElement sign = driver.findElement(By.xpath("//*[@id='gh-ug']/a"));
        //WebElement sign = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));
        WebElement sign = driver.findElement(By.xpath("//li[@id='gh-eb-u']//a"));

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        //li[@id='gh-eb-u']/span/span/a -- register
        search.sendKeys("dfsdf");
        //sign.click();
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
        search.sendKeys("dfsdf");
        searchBtn.click();
    }
}