package demopra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class application {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retro.knowzieslmsdev.com");
	    driver.findElement(By.id("mat-input-48")).sendKeys("Vipeen.bopche@knowzies.com");  
	    driver.findElement(By.id("password")).sendKeys("Admin@123");
	    driver.findElement(By.xpath("//*[@id=\"login_container\"]/app-login/div/div/div[2]/div[2]/form/div[3]/button")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[6]/a/img")).click();    //menu
	    driver.findElement(By.xpath("//*[@id=\"right-sidebar\"]/div/div/div[2]/div/div[4]/ul/li[1]/a")).click(); //manage coures
	    driver.findElement(By.xpath("//*[@id=\"addCourseDiv\"]/div/div")).click();   //add course
	    
	    driver.findElement(By.xpath("/html/body/app-root/app-top-navigation-layout/div/div/app-course/div[3]/div/div[4]/div/div/div[2]/form/div/div/div[1]/mat-form-field/div/div[1]/div/input")).sendKeys("java developer");
	    driver.findElement(By.xpath("//*[@id=\"mat-option-4721\"]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"addCourse\"]/div/div/div[3]/button")).click();
	    
	    driver.findElement(By.xpath("")).click();
	}

}

