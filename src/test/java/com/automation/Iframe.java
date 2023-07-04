package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement textbox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textbox.clear();
        textbox.sendKeys("laptop");
        driver.switchTo().defaultContent();
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());

        // https://www.hyrtutorials.com/p/frames-practice.html

    }
}
