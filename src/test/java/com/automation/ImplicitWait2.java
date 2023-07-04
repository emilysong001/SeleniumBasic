package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait2 {
    public static void main(String[] args) {
        //implicit wait
        WebDriver driver = new ChromeDriver();
        //implicit wait, wait element to be available in html
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement element = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        System.out.println(element.getText());

    }
}