package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		System.out.println("Browser will be close");
		dr.quit();
		System.out.println("Browser is closed");
	}

}
