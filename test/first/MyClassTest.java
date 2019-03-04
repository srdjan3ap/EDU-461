package first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MyClassTest {
	MyClass tester = new MyClass();

	@Test
	public void testExceptionIsThrown() {
		int x = 10001;
		int y = 5;

		assertThrows(IllegalArgumentException.class, () -> {
			tester.multiply(x, y);
		});
	}

	@Test
	public void testMultiply() throws IllegalAccessException {
		assertEquals(50, tester.multiply(10, 5), "10x5 must be 50");

	}

}
