package presentation;

public class exercise4Person {
	private int birth;
	private int death;

	public exercise4Person(int birthYear, int deathYear) {
		if(birthYear<deathYear){
			throw new IllegalArgumentException();
		}
		this.birth= birthYear;
		this.death= deathYear;
	}

	public int getBirth() {
		return birth;
	}

	public int getDeath() {
		return death;
	}
}
