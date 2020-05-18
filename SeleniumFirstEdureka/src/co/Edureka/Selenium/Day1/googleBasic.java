package co.Edureka.Selenium.Day1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;


public class googleBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		try {
			driver.findElement(By.id("fff"));
			
		}catch(Exception e)
		{System.out.println("element not found");}

	}

}
