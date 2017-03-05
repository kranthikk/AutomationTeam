package pack1;

import org.testng.annotations.Test;

public class B {
	@Test(priority=2)
	public void m3(){
		System.out.println("third test");
	}
	@Test()
	public void m4(){
		System.out.println("fourth test");
	}
	@Test(priority=1)
	public void m5(){
		System.out.println("fifth test");
	}
}
