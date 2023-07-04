package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait1 {
    //Implicit Wait Example
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://www.minted.com/");
        //wait popup show up and element show
        //don't need explicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("emily@gmail.com");
    }
}