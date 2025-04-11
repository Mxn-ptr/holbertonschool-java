public class CharacterGame {
	private int currentHealth;
	private String name;
	private String status;

	public CharacterGame(int initialHealth, String name) {
		this.setCurrentHealth(initialHealth);
		this.setName(name);
	}

	public int getCurrentHealth() {
		return this.currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = Math.max(0, Math.min(100, currentHealth));
    	this.status = (this.currentHealth > 0) ? "alive" : "dead";
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public void takeDamage(int damageAmount) {
		this.setCurrentHealth(this.currentHealth - damageAmount);
	}

	public void receiveHealing(int healingAmount) {
		this.setCurrentHealth(this.currentHealth + healingAmount);
	}

	public String getStatus() {
		return this.status;
	}
}
