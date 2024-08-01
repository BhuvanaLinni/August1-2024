package org.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartWindowsHandling
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
search.sendKeys("unicorn soft toy", Keys.ENTER);
WebElement toy1 = driver.findElement(By.xpath("//a[text()='OZEE Medium Size Funny Unicorn Stuffed Animal Plush Toy...']"));
toy1.click();
String parentWindowId = driver.getWindowHandle();
System.out.println(parentWindowId);
Set<String> allWindowId = driver.getWindowHandles();
System.out.println(allWindowId);
for(String x : allWindowId)
{
if(!parentWindowId.equals(x))
{
System.out.println("Child Window id is: " + x);
driver.switchTo().window(x);
}
}
WebElement cart = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
cart.click();
driver.switchTo().window(parentWindowId);
WebElement toy2 = driver.findElement(By.xpath("//a[text()='DRM Sleeping White Unicorn soft toy Unicorn for girls h...']"));
toy2.click();
Set<String> allWindowId2 = driver.getWindowHandles();
List<String> li1 = new ArrayList();
li1.addAll(allWindowId2);
String secondChildId = li1.get(2);
driver.switchTo().window(secondChildId);
WebElement cart1 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
cart1.click();
driver.switchTo().window(parentWindowId);
WebElement toy3 = driver.findElement(By.xpath("(//a[text()='MPR ENTERPRISES Pink, Blue & Yellow Unicorn Stuffed Sof...'])[1]"));
toy3.click();
Set<String> allWindowId3 = driver.getWindowHandles();
List<String> li2 = new ArrayList();
li2.addAll(allWindowId3);
String thirdChildId = li2.get(3);
driver.switchTo().window(thirdChildId);
WebElement cart2 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
cart2.click();

}
}
