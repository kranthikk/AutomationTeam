package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class A {

	@Test()
	public void m1() throws AWTException {
		/*
		 * Page1 p=new Page1(); p.openBrowser();
		 */
		System.out.println("first test");

		System.setProperty("webdriver.chrome.driver",
				"D://selinum//MyProjectWorkSpaceGit//SampleMavenProject//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		//driver.findElement(By.xpath(".//*[@id='text']")).sendKeys("Hello");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select"));
		Select sel=new Select(ele);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		sel.selectByIndex(2);
		sel.selectByIndex(6);
		driver.findElement(By.xpath("//input[@value='->']")).click();
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
	}

	@Test()
	public void m2() {
		System.out.println("second test");
	}
}
