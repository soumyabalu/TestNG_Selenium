package Secondtestbase;

import java.io.IOException;

import org.testng.annotations.Test;

import testNGfiles.TestBase;

public class Scope extends TestBase {
	@Test()
	public void homelogin() throws IOException {
		login();
		System.out.println("Succesfull");
	}
@Test(enabled=false)
public void mobileLogin() {
	System.out.println("Mobile login succesfull");
}
@Test(timeOut=4000)
public void manager() {
	System.out.println("Loan approved");
}
@Test(dependsOnMethods= {"homelogin"})
public void personalloan() {
	System.out.println("Approved");
}





}
