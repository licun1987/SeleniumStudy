package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxMizeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		System.out.println("Maxmize Browser");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.quit();
	}
}
