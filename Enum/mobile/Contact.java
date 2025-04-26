public class Contact {
	private String name;
	private String phoneNumber;
	private NumberType numberType;

	public Contact(String name, String phoneNumber, NumberType numberType) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.numberType = numberType;
	}

	public String getName() {
		return this.name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public NumberType getNumberType() {
		return this.numberType;
	}
}
