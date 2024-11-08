package firstprogramme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class Task2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String ExpectedTitle = "STORE";
		String ActualTitle = "";
		driver.get("https://www.demoblaze.com/");
		ActualTitle = driver.getTitle();
			 if(ActualTitle.contentEquals(ExpectedTitle))
			 {
				 System.out.println("Page landed on correct website");
		 }
			 else
			 {
				 System.out.println("Page landed on wrong website");
			 }
	}

}
