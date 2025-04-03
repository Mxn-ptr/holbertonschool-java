public class Manager extends Employee {
	public Manager(double fixedSalary) {
		super(fixedSalary);
	}

	@Override
	double calculateBonus(Department department) {
		if (department.reachedTarget()) {
			double delta = (department.getAchievedTargetValue() - department.getTargetValue()) / 100;
			return (this.getFixedSalary() / 5) + delta;
		}
		return 0;
	}
}
