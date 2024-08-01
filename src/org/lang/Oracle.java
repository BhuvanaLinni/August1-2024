package org.lang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle
{
public static void main(String[] args)
{
System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\hp\\eclipse-workspace\\SimpleJavaProject\\Driver\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AdF4I76xupeUvAUdHzsEqFjiv2DRIQ4IpDd1XXKqOLyWJa5-h-468qIv62BLgVaYEEpS-LFm4nf4&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1090017744%3A1721146160210438&ddm=0");
driver.manage().window().maximize();
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
// to find element by id
WebElement username = driver.findElement(By.id("identifierId"));
username.sendKeys("mailtobuvi@gmail.com");
WebElement username1 = driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b\"]"));
username1.click();  
}
}
