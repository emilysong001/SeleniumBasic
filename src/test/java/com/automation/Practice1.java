package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.ebay.co.uk/itm/274604752361?hash=item3fefb7fde9:g:Y8wAAOSwvm9i-4oJ&amdata=enc%3AAQAIAAAAsK3Dsuy%2FFB8QoSFz28r%2FxVuTVmRfnHO7vp%2FzW4ZFuzK5Qtax%2FMJb6kE5eN1RjaS6YqtY7oaP25tJBrQ8RlNmeAlSxDvOca53EbjHRApwdaozTBMjCq8PYXiO6eFTPh%2FrWTLHzJ6mUyGgKM16oXdBl1okz8oYYkGal12d1f26rf2rXWajPea0MfuYCcq9xF9JVeNdv1BDG95309ePk6Y%2BiVxOnds8GU5G1PwWWvWJFYkp%7Ctkp%3ABlBMUKap96aNYg");

        driver.manage().deleteAllCookies();

        ////button[@id='gdpr-banner-accept']

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2500);");
        /*try{
            driver.switchTo().alert();
        } catch (Exception e) {
            e.
            alert.accept();
        }*/
        WebElement contactLink = driver.findElement(By.xpath("//span[@class='details__label']"));
        contactLink.click();
        ////span[@class='details__label']/parent::summary/div/div

        //Phone: 442038533615
        //Email: onestopstoreuk@gmail.com

        // to get 442038533615,2 ways:
        //span[text()='Phone:']/following-sibling::span
        //span[text()='Phone:']/../span[2]  // /..go to parent,
        // not a good way, because this use index 2, if there is one more tag is added(developer change anything,
        // this one won't work

        // to get onestopstoreuk@gmail.com
        //span[text()='Email:']/following-sibling::span
        //span[text()='Email:']/../span[2]




    }
}
