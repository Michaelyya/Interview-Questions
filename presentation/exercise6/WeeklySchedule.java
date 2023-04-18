package presentation.exercise6;
import java.util.ArrayList;
import java.util.HashMap;
public class WeeklySchedule {


	private HashMap<String, ArrayList<Activity>> schedule;

	public WeeklySchedule() {
		schedule = new HashMap<String, ArrayList<Activity>>();
		schedule.put("Monday", new ArrayList<Activity>());
		schedule.put("Tuesday", new ArrayList<Activity>());
		schedule.put("Wednesday", new ArrayList<Activity>());
		schedule.put("Thursday", new ArrayList<Activity>());
		schedule.put("Friday", new ArrayList<Activity>());
		schedule.put("Saturday", new ArrayList<Activity>());
		schedule.put("Sunday", new ArrayList<Activity>());
	}

	public boolean addActivity(String day, Activity activity) {
		ArrayList<Activity> activities = schedule.get(day);
		if (activities == null) {
			return false;
		}
		for (Activity a : activities) {
			if (activity.overlapsWith(a)) {
				return false;
			}
		}
		activities.add(activity);
		return true;
	}

	public void removeActivity(String day, Activity activity) {
		ArrayList<Activity> activities = schedule.get(day);
		if (activities != null) {
			activities.remove(activity);
		}
	}

	public void displaySchedule(String day) {
		ArrayList<Activity> activities = schedule.get(day);
		if (activities == null || activities.isEmpty()) {
			System.out.println("No activities scheduled for " + day);
		} else {
			System.out.println("Activities scheduled for " + day + ":");
			for (Activity activity : activities) {
				System.out.println(activity);
			}
		}
	}
}

