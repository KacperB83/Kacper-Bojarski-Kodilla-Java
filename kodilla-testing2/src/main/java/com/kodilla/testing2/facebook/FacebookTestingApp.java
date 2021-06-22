package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//form/div[5]/a";

    //public static final String XPATH_DATE_DAY = "//select[contains(@aria-label, \"Dzień\")]";
    //*[@id="day"]
    public static final String XPATH_DATE_DAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[@id=\"day\"]";
   // public static final String XPATH_DATE_MONTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
   // public static final String XPATH_DATE_YEAR = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookie = driver.findElement(By.xpath(XPATH_COOKIE));
        acceptCookie.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();

        WebElement day = driver.findElement(By.name("birthday_day"));
        day.click();
        day.submit();

        WebElement month = driver.findElement(By.xpath(XPATH_DATE_DAY));
        month.click();
        month.submit();




    }
}
