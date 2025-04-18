public class PositiveInteger {
	private int value;

	public PositiveInteger(int value) {
		this.value = value;
	}

	public PositiveInteger(String value) {
		try {
			this.value = Integer.parseInt(value);
		} catch (Exception e) {
			throw new IllegalArgumentException("Value is not a positive integer");
		}

		if (this.value < 0)
			throw new IllegalArgumentException("Value is not a positive integer");
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		if (value < 0)
			throw new IllegalArgumentException("Value is not a positive integer");
		this.value = value;
	}

	public boolean isPrime() {
		for (int i = 2; i < Math.sqrt(this.value); i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}
}
