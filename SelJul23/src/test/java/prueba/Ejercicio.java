package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ejercicio {
	
	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com");
	    
	    driver.manage().window().maximize();
	    
	    //Obteniendo webElements de pagina web
	    WebElement userTxt = driver.findElement(By.id("user-name"));
	    WebElement pswTxt = driver.findElement(By.id("password"));
	    WebElement button = driver.findElement(By.id("login-button"));
	    		
	    //Logging in
	    userTxt.sendKeys("standard_user");
	    pswTxt.sendKeys("secret_sauce");
	    button.click();
	    
	    WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));   
	    addToCart.click();
	    
	    WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
	    cartButton.click();
	    
	    WebElement  checkout = driver.findElement(By.id("checkout"));
	    checkout.click();
	    
	    WebElement firstName = driver.findElement(By.id("first-name"));
	    WebElement lastName = driver.findElement(By.id("last-name"));
	    WebElement zip = driver.findElement(By.id("postal-code"));
	    
	    firstName.sendKeys("Luis");
	    lastName.sendKeys("Martinez");
	    zip.sendKeys("21330");
	    
	    WebElement contBut = driver.findElement(By.id("continue"));
	    contBut.click();
	    
	    WebElement finishBut = driver.findElement(By.id("finish"));
	    finishBut.click();
	    
	    boolean thankYou = driver.findElement(By.className("complete-header")).isDisplayed();
	    	
	    if(thankYou) {
	    	System.out.println("Correct!");
	       }
 	   }
}
