package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinoGame {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=github&rlz=1C1VDKB_enIN1007IN1007&oq=git&aqs=chrome.1.69i57j0i271l2j69i60l2.8263j0j15&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//*[@id=\"main-frame-error\"]/div[4]/canvas")).sendKeys(Keys.SPACE);
	}

}
