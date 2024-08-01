package org.lang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsDragandDrop 
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver = new ChromeDriver();	
driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
Actions a = new Actions(driver);
WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart1']"));
a.dragAndDrop(source, target).perform();
WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
WebElement target1 = driver.findElement(By.xpath("//div[@id='shoppingCart4']"));
a.dragAndDrop(source1, target1).perform();
WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
WebElement target2 = driver.findElement(By.xpath("//div[@id='shoppingCart3']"));
a.dragAndDrop(source2, target2).perform();
WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
a.dragAndDrop(source3, target3).perform();
}
}
