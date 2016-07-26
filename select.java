import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=4b084ec583b1da016a740df5e157f73e");

		driver.findElement(By.name("userName")).sendKeys("satya");
		driver.findElement(By.name("password")).sendKeys("satya");
		driver.findElement(By.name("login")).click();
		WebElement s=driver.findElement(By.name("fromPort"));
		Select sel=new Select(s);
		sel.selectByValue("London");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.name("findFlights"))).contextClick().build().perform();
		//driver.quit();
	}

}
