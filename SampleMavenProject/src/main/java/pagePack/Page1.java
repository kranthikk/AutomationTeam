package pagePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Page1 {
	
	public void pageM1(){
		
		System.setProperty("webdriver.chrome.driver", "D://selinum//MyProjectWorkSpaceGit//SampleMavenProject//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

}
