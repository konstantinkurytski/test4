package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.DriverManager;
import java.util.ArrayList;

public class Main {

   public static void main(String[] args) throws InterruptedException {


           System.setProperty("webdriver.chrome.driver", "E:\\kosta\\QA\\chromedriver.exe");
           WebDriver driver1 = new ChromeDriver();
           driver1.get("https://google.com");
           String title = driver1.getTitle();
           String re = driver1.getCurrentUrl();
           System.out.println(re);
           System.out.println(title);
           Assert.assertEquals(title, "Google");
           WebElement input  = driver1.findElement(By.xpath("//textarea[@aria-label='Найти']"));
           WebElement input1 = input;
           input1.getTagName();
           System.out.println(input1);
           input.sendKeys("линкедин"+ Keys.ENTER);
           String win1 = driver1.getWindowHandle();


           JavascriptExecutor js = (JavascriptExecutor)driver1;
           js.executeScript("window.open()");
           js.executeScript("window.open()");
           js.executeScript("window.open()");


           ArrayList<String> windows = new ArrayList<String> (driver1.getWindowHandles());
           driver1.switchTo().window(windows.get(0));
           Thread.sleep(1090);
           String window1 = windows.get(0);
           System.out.println(window1);
           driver1.switchTo().window(windows.get(1));
           Thread.sleep(1000);
           String window2 = windows.get(1);
           System.out.println(window2);
           driver1.switchTo().window(windows.get(2));
           Thread.sleep(1000);
           String window3 = windows.get(2);
           System.out.println(window3);
           driver1.switchTo().window(windows.get(3));
           Thread.sleep(1000);
           String window4 = windows.get(3);
           System.out.println(window4);

           driver1.quit();
    }
}