package firstprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
      WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
	  driver.get("http://google.com/");
	 
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	}

}
