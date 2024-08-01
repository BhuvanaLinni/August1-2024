package org.lang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook 
{
public static void main(String[] args)
{
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();
driver.get("https://WWW.facebook.com/");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
//to find element by id
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("mailtobuvigmail.com");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("123456433");
//to find element by name
WebElement login = driver.findElement(By.name("login"));
login.click();
//to find element by tag name
WebElement txt = driver.findElement(By.tagName("img"));
String text1 = txt.getText();
System.out.println(text1);
//to find element by linktext
WebElement linktxt = driver.findElement(By.linkText("Forgotten password?"));
String text2 = linktxt.getText();
System.out.println(text2);
//to find element by partiallinktext
WebElement partial = driver.findElement(By.partialLinkText("Facebook "));
String text3 = partial.getText();
System.out.println(text3);



}
}
