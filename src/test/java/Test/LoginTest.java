package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass{

	@Test(dataProvider = "getData")
	public void loginZoho(String userName, String password, String browser) {
	
		openBrowser(browser);
		HomePage home = new HomePage(getDriver());
		LoginPage login = home.clickOnLoginButton();
		login.LoginInZoho("mona.olabz@gmail.com", "mona!983");
		
		//getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div/a[4]")).click();
		/*getDriver().findElement(By.xpath("//input[@id='login_id']")).sendKeys(userName);
		getDriver().findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
		getDriver().findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();	*/
		closeBrowser();
		
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData() {
		Object obj[][] = new Object[2][3];
		obj[0][0]= "mona.olabz@gmail.com";
		obj[0][1]="mona!983";
		obj[0][2]="chrome";
		
		obj[1][0]= "abhi.olabz@gmail.com";
		obj[1][1]="mona!9";
		obj[1][2]="firefox";
		
		return obj;
	}
	
}
