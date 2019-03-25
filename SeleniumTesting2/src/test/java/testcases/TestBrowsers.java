package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "E:\\selenium-prerequisite\\Chrome driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tecobytes.com");
		String title=driver.getTitle();
		System.out.println(title.length());
		driver.close();
	}

}
