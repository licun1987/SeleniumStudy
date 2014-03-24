package SeleniumStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(1000);
		dr.manage().window().setSize(new Dimension(600,400));
		System.out.println("��������Ĵ�С�Զ���Ϊ600*400");
		Thread.sleep(2000);
		dr.quit();
	}

}
