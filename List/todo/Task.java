public class Task {
	private String description;
	private boolean isDone = false;
	private int identifier;

	public Task(String description, int identifier) {
		this.modifyDescription(description);
		this.identifier = identifier;
	}

	public String getDescription() {
		return this.description;
	}

	public boolean getIsDone() {
		return this.isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}

	public int getIdentifier() {
		return this.identifier;
	}

	public void modifyDescription(String description) {
		if (description == null || description.trim().isEmpty())
			throw new IllegalArgumentException("Invalid task description");
	}
}
