package Browserstack.BrowserStackIntegration;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RunOnCloude {
	public static final String USERNAME = "deepaliakolkar1";
	  public static final String AUTOMATE_KEY = "rXb28265nq6xeHRv9Ws1";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "78.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.5.2");

		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		    driver.get("http://www.google.com/ncr");
		    WebElement element = driver.findElement(By.name("q"));
System.out.println("Hi");
		    element.sendKeys("BrowserStack");
		    element.submit();
			Thread.sleep(5000);	

		    //System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//h3[text()='BrowserStack: Most Reliable App & Cross Browser Testing ...']")).click();
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//a[@id='signupModalButton']")).click();
	Thread.sleep(500);	

		    driver.quit();
	}

}
