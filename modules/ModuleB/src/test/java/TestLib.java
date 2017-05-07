package PackageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestLib {

	@DisplayName("Lib.getTrue() Test")
	@Test
	public void testGetTrue() {
		assertTrue(Lib.getTrue() == true, () -> "Lib.getTrue() returns incorrect result");

		System.out.println("Lib.getTrue() Test passed");
	}

}
