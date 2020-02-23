 	package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	private WebDriver driver;
	
	ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	
	public WebDriver getDriver() {
		return threadLocal.get();
	}
	
	public void setDriver(WebDriver driver)  {
		threadLocal.set(driver);
	}
	
	
	public void openBrowser(String browser) {
		if(browser == "firefox") {
			System.out.println("Lunching" + browser);
			driver = new FirefoxDriver();
			
		}
		else if(browser == "chrome") {
			System.out.println("Lunching" + browser);
			System.setProperty("webdriver.chrome.driver", "F:\\TestApp\\TestAutomation\\src\\test\\resources\\webDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else {
			System.out.println("No browser found");
		}
		
		setDriver(driver);
		getDriver().get("https://www.zoho.com/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		getDriver().quit();
	}

}
