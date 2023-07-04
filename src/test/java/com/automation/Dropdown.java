package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.ebay.com");

        //create web element using select tag
        WebElement dropdown = driver.findElement(By.id("gh-cat"));
        //wrap that web element using select class methods
        Select catDropdown = new Select(dropdown);
        //select the option by using text
        catDropdown.selectByVisibleText("Business & Industrial");

        List<WebElement> listOfCat = catDropdown.getOptions();
        /*for (int i = 0; i < listOfCat.size(); i++) {
            System.out.println(listOfCat.get(i).getText());
        }*/
        for (WebElement cat: listOfCat) {
            System.out.println(cat.getText());
        }


    }

}
