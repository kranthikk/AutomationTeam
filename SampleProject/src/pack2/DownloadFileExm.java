package pack2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileExm {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		driver.findElement(By.xpath(".//*[@id='post-body-4024384759750876807']/div[1]/div/a[2]")).click();
		//auto it code for download
		Runtime.getRuntime().exec("C:\\Users\\ranjithharley2761\\git\\AutomationTeam\\SampleProject\\AutoITSciTeScripts\\autoItDownload.exe");
	}

}
