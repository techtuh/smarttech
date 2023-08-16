package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorld {

	
	public void run() {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

	}
	public static void main(String[] args) {
		
	
	HelloWorld obj = new HelloWorld();
	obj.run();
	}
}
