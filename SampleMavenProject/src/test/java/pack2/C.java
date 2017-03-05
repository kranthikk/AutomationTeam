package pack2;

import org.testng.annotations.Test;

public class C {

	@Test(priority=2)
	public void m6(){
		System.out.println("sixth test");
	}
	@Test()
	public void m7(){
		System.out.println("seventh test");
	}
}
