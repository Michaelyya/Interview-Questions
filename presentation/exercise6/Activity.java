package presentation.exercise6;

public class Activity {

	private String day;
	private int startHour;
	private int endHour;

	public Activity(String day, int startHour, int endHour) {
		this.day = day;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public String getDay() {
		return day;
	}

	public int getStartHour() {
		return startHour;
	}

	public int getEndHour() {
		return endHour;
	}

	public boolean overlapsWith(Activity other) {
		return day.equals(other.day) && ((startHour >= other.startHour && startHour < other.endHour) ||
			   (endHour > other.startHour && endHour <= other.endHour) ||
			   (startHour < other.startHour && endHour > other.endHour));
	}

	@Override
	public String toString() {
		return day + " from " + startHour + " to " + endHour;
	}
}


