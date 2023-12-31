package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sau1");
        loginBtn.click();
        //WebElement error = driver.findElement(By.xpath("//div/h3"));
        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        System.out.println(error.getText());

        //Ctrl+F in the developer tool, to check the xpath




    }
}