package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        /*System.out.println("======================");
        driver.get("https://www.ebay.com");
        WebElement dropdown = driver.findElement(By.id("gh-cat"));
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //arguments[0] takes parameters from dropdown
        js.executeScript("arguments[0].style.border='thick solid #0000FF';",dropdown);
        js.executeScript("arguments[0].style.border='thick solid #0000FF';",search);
        js.executeScript("arguments[0].style.border='thick solid #0000FF';",searchBtn);*/


        System.out.println("==========scroll============");
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 250);");
            //js.executeScript("window.scrollTo(arguments[0], document.body.scrollHeight);",i*1000);
            //scroll is executing too fast, so wair for a while to how it happens
            Thread.sleep(2000);
            //System.out.println(i);
        }
    }
}
