package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleAndUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		String url="http://www.baidu.com";
		System.out.printf("now accesss %s \n",url);
		dr.get(url);
		Thread.sleep(2000);
		System.out.printf("title of current page is %s \n", dr.getTitle());
		System.out.printf("url of current page is %s \n", dr.getCurrentUrl());
		dr.quit();
		System.out.println("Browser Closed");
	}

}
