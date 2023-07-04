package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SystemClassExample {
    public static void main(String[] args) {
        //the root of your project
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        //  1. Open Website
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


        //upload Files
       /* driver.get("https://the-internet.herokuapp.com/upload");
        WebElement inputBox = driver.findElement(By.id("file-upload"));
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));

        String currentDir = System.getProperty("user.dir"); //current directory of any machine
        //inputBox.sendKeys("C:\\Users\\xuanx\\OneDrive\\Desktop\\photo\\Untifghfled.png");
        inputBox.sendKeys(currentDir+"/target/screenshot.png");
        uploadBtn.click();*/

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileDownload = driver.findElement(By.xpath("//a[text()='Untifghfled.png']"));
        System.out.println(fileDownload.isDisplayed());
        fileDownload.click();





    }
}
