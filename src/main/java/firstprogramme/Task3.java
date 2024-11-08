package firstprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
        driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div/span[2]")).click();
        String Actualtitle = "";
        Actualtitle = driver.getTitle();
        System.out.println(Actualtitle);
        }

}
