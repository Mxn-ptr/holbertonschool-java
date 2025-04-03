class TheNumber {
	public static void todivide(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch(Exception e) {
			System.out.println("It is not possible to divide by zero.");
		} finally {
			System.out.println(a + " / " + b + " = " + result);
		}
	}
}
