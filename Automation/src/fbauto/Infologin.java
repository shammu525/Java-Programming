package fbauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Infologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		System.setProperty("webdriver.gecko.driver", "F:/driver/geckodriver.exe");
 
		
		WebDriver driver = new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Amplomb"); //1st name
    driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Tech"); //Surname
    driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("fiberathome71@gmail.com"); //email
    driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("Tech123456"); //pass
    
    driver.findElement(By.xpath(".//*[@id='u_0_a']")).click(); //Gender
    
   
   Select sell=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
    
    sell.selectByIndex(3);
    
   Select sell1=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
    
    sell1.selectByIndex(4);
    
    Select sell2=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
    
    sell2.selectByIndex(11);
    
    driver.findElement(By.xpath(".//*[@id='u_0_11']")).click(); //Signup
    
    
    driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click(); //Create a page
    driver.navigate().back();
    
}

}

