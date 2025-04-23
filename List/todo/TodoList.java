import java.util.ArrayList;

public class TodoList {
	private ArrayList<Task> tasks;

	public TodoList() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		if (tasks.stream().anyMatch(Etask -> Etask.getIdentifier() == task.getIdentifier()))
			throw new IllegalArgumentException(String.format("Task with identifier %d already exists in the list", task.getIdentifier()));
		tasks.add(task);
	}

	public boolean markTaskDone(int identifier) {
		for (Task task : tasks) {
			if (task.getIdentifier() == identifier) {
				task.setIsDone(true);
				return true;
			}
		}
		return false;
	}

	public boolean undoTask(int identifier) {
		for (Task task : tasks) {
			if (task.getIdentifier() == identifier) {
				task.setIsDone(false);
				return true;
			}
		}
		return false;
	}

	public void undoAll() {
		for (Task task : tasks) {
			task.setIsDone(false);
		}
	}

	public void completeAll() {
		for (Task task : tasks) {
			task.setIsDone(true);
		}
	}

	public void listTasks() {
		String listResponse = new String();
		for (Task task : tasks) {
			listResponse += String.format("[%c]  Id: %d - Description: %s\n", task.getIsDone() ? 'X' : ' ', task.getIdentifier(), task.getDescription());
		}
		System.out.print(listResponse);
	}
}
