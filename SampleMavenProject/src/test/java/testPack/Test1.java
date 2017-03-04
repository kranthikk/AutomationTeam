package testPack;

import org.testng.annotations.Test;

import pagePack.Page1;

public class Test1 {

	
	@Test()
	public void page1Test(){
		Page1  p=new Page1();
		p.pageM1();
	}
}
