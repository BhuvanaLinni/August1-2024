package org.lang;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor
{
public static void main(String[] args)
{
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement firstname = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
js.executeScript("arguments[0].setAttribute('value','bhuvana')", firstname);

}
}
