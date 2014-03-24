package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		String url="http://www.baidu.com";
		System.out.printf("now access %s \n",url);
		dr.get(url);
		Thread.sleep(2000);
		System.out.println("Browser will close");
		dr.quit();
		
	}

}
