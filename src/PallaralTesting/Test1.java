package PallaralTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {
	WebDriver driver;


	@SuppressWarnings("deprecation")
	@Test
	public void module1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.quit();

	}





	@SuppressWarnings("deprecation")
	@Test
	public void module2() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void module3() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:www.google.com/");
		driver.manage().window().maximize();
		driver.quit();
	}



}
