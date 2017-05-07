package PackageA;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class TestApp {

	@Test
	public void testAppDummy() {
		//fail("Not yet implemented");

		System.out.println("App dummy test:");

		assertTrue(true, () -> "true != true :), App dummy test failed");

		System.out.println("App dummy test passed");
	}

}
