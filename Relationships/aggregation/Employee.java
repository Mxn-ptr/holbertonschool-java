public class Employee {
	private String name;
	private int code;
	private Address address;

	public Employee(String name, int code, Address address) {
		this.name = name;
		this.code = code;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public int getCode() {
		return this.code;
	}

	public Address getAdress() {
		return this.address;
	}

	public void introduce() {
		System.out.println("Code: " + this.code);
		System.out.println("Name: " + this.name);
		System.out.println("District: " + this.address.getDistrict());
		System.out.println("City: " + this.address.getCity());
		System.out.println("Country: " + this.address.getCountry());
	}
}
