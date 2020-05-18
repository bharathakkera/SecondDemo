package co.Edureka.Selenium.Day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	WebDriver driver;
	JavascriptExecutor js;
	
	public void InvokeBrowser(){
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://www.edureka.co");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
					
	}
	public void searchCourse() {
		
		try {
			System.out.println("enter");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("devops-certification-courses")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Big Data")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,800");
			
			/*driver.findElements(By.xpath("//a[@class='giTrackElementClpV2'][contains(text(),'Cloud Computing')]"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			
			System.out.println("Scroll down is worked");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
	public static void main(String[] args) {
		
		DayOne myObj = new DayOne();
		myObj.InvokeBrowser();
		System.out.println("Hello World");
		myObj.searchCourse();
		
		}
}
