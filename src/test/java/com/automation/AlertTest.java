package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button3.click();
        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("hello");
        Thread.sleep(5000);
        alert.accept();
        //alert.dismiss();

    }
}
