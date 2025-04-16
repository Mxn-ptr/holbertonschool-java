import activity.Activity;

public class WorkflowMachine {
	public void execute(Workflow worflow) {
		for (Activity activity : worflow.getActivities()) {
			activity.execute();
		}
	}
}
