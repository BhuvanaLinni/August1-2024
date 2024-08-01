package org.lang;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windows
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://WWW.amazon.in/");
driver.manage().window().maximize();
WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
searchbox.sendKeys("Iphone 15 pro max",Keys.ENTER);
WebElement iphone1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro Max (256 GB) - White Titanium']"));
iphone1.click();
String parentWindowId = driver.getWindowHandle();
System.out.println(parentWindowId);
Set<String> allWindowId = driver.getWindowHandles();
System.out.println(allWindowId);
for(String x : allWindowId)
{
if(!parentWindowId.equals(x))
{
System.out.println("Child Window id is "+x);
driver.switchTo().window(x);
}
}
WebElement cart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
cart.click();
Thread.sleep(2000);
driver.switchTo().window(parentWindowId);
WebElement iphone2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro Max (256 GB) - Black Titanium']"));
iphone2.click();
Set<String> allWindowId2 = driver.getWindowHandles();
List<String> li = new ArrayList();
li.addAll(allWindowId2);
String secondChildId = li.get(2);
System.out.println("Second child id is: "+ secondChildId);
driver.switchTo().window(secondChildId);
WebElement cart1 = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
cart1.click();
driver.switchTo().window(parentWindowId);
Thread.sleep(2000);
WebElement iphone3 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Pink']"));
iphone3.click();
Set<String> allWindowId3 = driver.getWindowHandles();
List<String> li1 = new ArrayList();
System.out.println(allWindowId3);
li1.addAll(allWindowId3);
String thirdChildId = li.get(3);
System.out.println("Third child id is: "+ thirdChildId);
driver.switchTo().window(thirdChildId);
WebElement cart2 = driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce'])[1]"));
cart2.click();
driver.switchTo().window(parentWindowId);
}
}
