

import org.testng.annotations.Test;



public class SampleContactTest {

	@Test(groups = "regression test")
	public void createContactTest() {
		
		String browser = System.getProperty("BROWSER");
		System.out.println("=======contact created=c=======");
		String url = System.getProperty("URL");
	}

	@Test(groups = "smoke test")
	public void aditContactTest() {
		System.out.println("=======contact edited=a=====");
	}
	@Test(groups = "smoke test")
	public void bditContactTest() {
		System.out.println("=======contact edited==b=====");
	}
	@Test(groups = "smoke test")
	public void dditContactTest() {
		System.out.println("=======contact edited==d=====");
	}
	
}

