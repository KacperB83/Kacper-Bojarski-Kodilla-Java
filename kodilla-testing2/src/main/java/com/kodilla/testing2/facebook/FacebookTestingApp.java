package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[5]/a";

    public static final String XPATH_DATE_DAY = "day";
    public static final String XPATH_DATE_MONTH = "month";
    public static final String XPATH_DATE_YEAR = "year";
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookie = driver.findElement(By.xpath(XPATH_COOKIE));
        acceptCookie.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();
        Thread.sleep(5000);

        WebElement dayLabel = driver.findElement(By.id(XPATH_DATE_DAY));
        dayLabel.click();
        Select day = new Select(dayLabel);
        day.selectByIndex(3);
        Thread.sleep(1000);
        WebElement monthLabel = driver.findElement(By.id(XPATH_DATE_MONTH));
        monthLabel.click();
        Select month = new Select(monthLabel);
        month.selectByIndex(3);
        Thread.sleep(1000);
        WebElement yearLabel = driver.findElement(By.id(XPATH_DATE_YEAR));
        dayLabel.click();
        Select year = new Select(yearLabel);
        year.selectByVisibleText("1984");
        Thread.sleep(1000);

       /* WebElement month = driver.findElement(By.xpath(XPATH_DATE_MONTH));
        month.click();
        month.submit();*/




    }
}
