package pack2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileExm {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.findElement(By.name("img")).click();
		//auto it code
		Runtime.getRuntime().exec("C:\\Users\\ranjithharley2761\\git\\AutomationTeam\\SampleProject\\AutoITSciTeScripts\\autoItUpload.exe");
		
	}

}
