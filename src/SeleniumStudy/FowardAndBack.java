package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FowardAndBack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		String firsturl="http://www.baidu.com";
		System.out.printf("now accesss %s \n", firsturl);
		dr.get(firsturl);	
		Thread.sleep(2000);
		String secondurl="http://www.google.com.hk";
		System.out.printf("now accesss %s \n",secondurl);
		dr.get(secondurl);
		Thread.sleep(2000);
		System.out.printf("now back to %s \n",firsturl);
		dr.navigate().back();
		Thread.sleep(2000);
		System.out.printf("now forward to %s \n", secondurl);
		dr.navigate().forward();
		Thread.sleep(2000);
		dr.quit();
		System.out.println("Browser closed");
		
	}

}
