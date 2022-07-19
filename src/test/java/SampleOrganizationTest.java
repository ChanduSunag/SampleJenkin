

import org.testng.annotations.Test;


public class SampleOrganizationTest {


	@Test(groups = "smoke test")
	public void createOrganizationTest() {
	System.out.println("=========organization created==========");
	
	System.out.println("=========organization deleted==========");
	}

	@Test(groups="regression test")
	public void editOrganizationTest() {
	System.out.println("========edit organization========");
	}
}
