package org.lang;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Straive
{
public static void main(String[] args)
{
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/nlogin/login");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}
}
