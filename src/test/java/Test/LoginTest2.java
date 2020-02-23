package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseClass{
	
	@Test(dataProvider = "getData")
	public void loginTest(String username, String password,String browser) {
		
		openBrowser(browser);
		HomePage home = new HomePage(getDriver());
		LoginPage login = home.clickOnLoginButton();
		login.LoginInZoho("mona.olabz@gmail.com", "mona!983");
		
		
			closeBrowser();
	}
	
	@DataProvider(parallel= true)
	public Object[][] getData() {
		Object[][] obj = new Object[1][3];
		obj[0][0]="mona.olabz@gmail.com";
		obj[0][1]="mona!983";
		obj[0][2]="chrome";
		
		return obj;
		
		
	}
}
