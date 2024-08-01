package org.lang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsMouseHover
{
public static void main(String[] args)
{
System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://greenstech.in/Selenium-course-content.html");
driver.manage().window().maximize();
Actions a = new Actions(driver);
WebElement courses = driver.findElement(By.xpath("//a[text()='Courses ']"));
a.moveToElement(courses).perform();
WebElement courses1 = driver.findElement(By.xpath("//a[text()='Oracle Training ']"));
a.moveToElement(courses1).perform();
}
}
