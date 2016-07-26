package OR;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class getHashMap {
	
	static WebDriver driver;
	static String url="https://gmail.com";
	private static Object username;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver=new ChromeDriver("C:/Users/426813/Documents");
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		ObjectRepo OR=new ObjectRepo();
		OR. getobjectrepo();
		
		List<WebElement> inputs=driver.findElements(By.xpath(".//input"));
		
		System.out.println(inputs);
		
		for(WebElement input:inputs)
			
		{
			String text=input.getAttribute("id");
			//System.out.println(text);
			
			if(text.equals("Email"))
			{
				input.sendKeys("priyanshuc1984@gmail.com");
				
			}
			
			if(text.equals("next"))
			{
				input.click();
			}			
			/*if(text.equals("Passwd-hidden"))
				
			{
				System.out.println("passwo");
				input.sendKeys("priyanshu123");
			}
			*/
			if(text.equals("signIn"))
			{
				input.click();
			}	
			
		}
		
	
		
		
		
		//System.out.println("username" +getHashMap.username);
		

	}

	

}
