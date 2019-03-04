package first;

public class MyClass {
	public int multiply(int x, int y) throws IllegalAccessException {
		if (x > 999) {
			throw new IllegalAccessException("X should be less than 1000");
		}
		return x / y;
	}

}
