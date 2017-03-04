package pack4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	
	@Test()
	public void m() throws IOException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		String excelPath="C:/Users/ranjithharley2761/git/AutomationTeam/SampleProject/TestData/testData.xlsx";
		
		File f=new File(excelPath);
		FileInputStream fp=new FileInputStream(f);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fp);
		XSSFSheet s=wb.getSheet("loginData");
		
		//String uname=s.getRow(1).getCell(0).getStringCellValue();
		String pwd=s.getRow(1).getCell(1).getStringCellValue();
		
		
		
		driver.findElement(By.id("email")).sendKeys(s.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
	
}
