package presentation;

public class exercise3 {
	public void Bulls_Cows(String guess, String secret) throws IllegalAccessException {
		if(!guess.matches("[0-9]+") || !secret.matches("[0-9]+") || guess.length() != 4 || secret.length() != 4){
			throw new IllegalArgumentException();
		}
		int bulls = 0;
		int cows = 0;
		for(int i=0; i<guess.length();i++){
			if(guess.charAt(i) == secret.charAt(i)){
				bulls++;
			}
			else if(secret.indexOf(guess.charAt(i))!=-1){
				cows++;
			}
		}

		System.out.println("# of bulls: " + bulls);
		System.out.println("# of cows: " + cows);
	}
}
