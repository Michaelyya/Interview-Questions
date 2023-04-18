package presentation;

public class exercise5Card {
	private String suit;
	private int rank;
	//The getSuit() and getRank() methods only provide access to the values of the suit and rank fields respectively,
	// but do not allow modification. Therefore, it can be concluded that Card is an immutable data type.
	public exercise5Card(String s, int r){
		this.suit = s;
		this.rank = r;
	}

	public int getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public String toString() {
		return this.rank + " of " + this.suit;
	}
	/*
	switch
	rank ace-1
	rank king -13
	rank queen -12
	rank jack -11
	 */
	public exercise5Card getHighCard(exercise5Card[] cards) {
		exercise5Card myCard = cards[0];
		for (int i = 1; i < cards.length; i++) {
			if (cards[i].getRank() > myCard.getRank() ||
				   (cards[i].getRank() == myCard.getRank() && cards[i].getSuit().compareTo(myCard.getSuit()) > 0)) {
				myCard = cards[i];
			}
		}
		return myCard;
	}
}
