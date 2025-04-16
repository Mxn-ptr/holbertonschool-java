import java.util.ArrayList;
import activity.Activity;

public class Workflow {
	private ArrayList<Activity> activities;

	public Workflow() {
        this.activities = new ArrayList<>();
    }

	public void registerActivity(Activity activity) {
		activities.add(activity);
	}

	public ArrayList<Activity> getActivities() {
		return this.activities;
	}
}
