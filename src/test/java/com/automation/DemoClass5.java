package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoClass5 {
    public static void main(String[] args) {
        /*WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ////p[contains(text(),'Username')] - not working
        ////p[text() = contains (., 'Username')]
        ////p[contains (., 'Username')]
        WebElement username = driver.findElement(By.xpath("//p[text() = contains (., 'Username')]"));
        System.out.println(username.getText());*/

       /* String usernameValue = username.getText().split(":")[1];
        WebElement password = driver.findElement(By.xpath("//p[contains (., 'Password')]"));
        String passwordValue =username.getText().split(":")[1];
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@name='password']"));
        usernameTextBox.sendKeys(usernameValue);
        passwordTextBox.sendKeys(passwordValue);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();*/


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //  1. Open Website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 2. Get Username and password from website
        //selenium doesn't accept .
        WebElement usernameValue = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
        WebElement passwordValue = driver.findElement(By.xpath("//p[text()='Password : admin123']"));

        String username = usernameValue.getText().split(":")[1].trim();
        System.out.println();
        String password = passwordValue.getText().split(":")[1].trim();

        // 3. Login with same username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();


    }
}