public class CharacterGame {
	private int currentHealth;
	private String name;
	private String status;

	public CharacterGame() {
	}

	public int getCurrentHealth() {
		return this.currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		
		if (currentHealth > 0) {
			this.status = "alive";
		} else {
			this.status = "dead";
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeDamage(int damageAmount) {
		this.setCurrentHealth(Math.max(0, this.currentHealth - damageAmount));
	}

	public void receiveHealing(int healingAmount) {
		this.setCurrentHealth(Math.min(100, this.currentHealth + healingAmount));
	}

	public String getStatus() {
		return this.status;
	}
}
