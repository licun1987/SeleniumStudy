package SeleniumStudy;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class SimpleLocate2 {

    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		WebDriver dr=new FirefoxDriver();

		File file=new File("src/checkbox.html");
		String FilePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",FilePath);
		dr.get(FilePath);
		 List<WebElement> checkboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
         for(WebElement checkbox : checkboxes) {
             checkbox.click();
         }
         dr.navigate().refresh();
         System.out.printf("%d\n", checkboxes.size());
         List<WebElement> inputs = dr.findElements(By.tagName("input"));
         for(WebElement input : inputs){
             if(input.getAttribute("type").equals("checkbox")){
                 input.click();
             }
         }
         List<WebElement> allCheckboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
         allCheckboxes.get(allCheckboxes.size() - 1).click();

         Thread.sleep(1000);
         System.out.println("browser will be close");
         dr.quit();  
    }

}
