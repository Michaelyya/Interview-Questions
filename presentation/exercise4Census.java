package presentation;

public class exercise4Census {
	public static int mostAlive(exercise4Person[] persons, int startYear, int endYear){
		int max = 0;
		int maxYear = 0;
		int[] yearCounts = new int[endYear-startYear+1];
		for(exercise4Person person: persons){
			for(int year = person.getBirth(); year<person.getDeath(); year++){
				if(year>=startYear && year<= endYear){
					yearCounts[year-startYear]++;
				}
			}
		}
		for(int i = 0; i<yearCounts.length; i++){
			if(yearCounts[i]>max){
				max = yearCounts[i];
				maxYear = i + startYear;
			}
		}
		return maxYear;
	}
}
