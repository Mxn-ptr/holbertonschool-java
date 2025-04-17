public class Address {
	private String street;
	private String number;
	private String complement;
	private String district;
	private String city;
	private String state;
	private String country;

	public Address(String street, String number, String complement, String disctrict, String city, String state, String country) {
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = disctrict;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getStreet() {
		return this.street;
	}

	public String getNumber() {
		return this.number;
	}

	public String getComplement() {
		return this.complement;
	}

	public String getDistrict() {
		return this.district;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getCountry() {
		return this.country;
	}
}
