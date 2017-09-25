package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {
	public static void main(String[] args){
	WebDriver driver=new FirefoxDriver();
	 
     driver.get("http://www.ksrtc.in/oprs-web/");

     driver.manage().window().maximize();

     driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
     System.out.println("new");
	}

}
