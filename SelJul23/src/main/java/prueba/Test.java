package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Hola Selenium");
		String exePath = "./driver/chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	}
	
	
}
