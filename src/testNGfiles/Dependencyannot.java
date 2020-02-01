package testNGfiles;

import java.io.IOException;

import org.testng.annotations.Test;

 public class Dependencyannot extends TestBase {
	@Test
	public void OpeningBrowser() throws IOException {
		login();
	
	System.out.println("Executing opening browser");
	}
	@Test(dependsOnMethods= {"OpeningBrowser"},alwaysRun = true)
	public void flightBooking() {
		System.out.println("Executing flightbooking");
	}
@Test(timeOut=5000)
public void timeRelated() {
	System.out.println("Executing wait time");
}
@Test(enabled=false)
public void loan() {
	System.out.println("Executing loan");
	
}





}




