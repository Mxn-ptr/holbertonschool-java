public class Employee {
	private double fixedSalary;

	public Employee(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	public double getFixedSalary() {
		return this.fixedSalary;
	}

	public double calculateBonus(Department department) {
		if (department.reachedTarget()) {
			return this.fixedSalary / 10;
		}
		return 0;
	}

	public double calculateTotalSalary(Department department) {
		return this.fixedSalary + this.calculateBonus(department);
	}
}
