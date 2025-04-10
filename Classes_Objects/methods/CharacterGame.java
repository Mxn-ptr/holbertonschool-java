public class CharacterGame {
	private int currentHealth;
	private String name;

	public CharacterGame() {
	}

	public int getCurrentHealth() {
		return this.currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeDamage(int damageAmount) {
		this.currentHealth = Math.max(0, this.currentHealth - damageAmount);
	}

	public void receiveHealing(int healingAmount) {
		this.currentHealth = Math.min(100, this.currentHealth + healingAmount);
	}
}
