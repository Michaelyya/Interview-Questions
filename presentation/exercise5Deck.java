package presentation;

import java.util.Random;

public class exercise5Deck {
	private String[] suit = {"clubs","diamonds", "hearts", "spades"};
	private exercise5Card[] cards;
	public exercise5Deck(){
		int i =0;
		cards = new exercise5Card[52];
		for (int rank =1; rank<=13; rank++){
			for (String su : suit) {
				cards[i] = new exercise5Card(su, rank);
				i++;
			}
		}
//		for (int rank = 1; rank <= 13; rank++) {
//			cards[i++] = new Card("Spades", rank);
//			cards[i++] = new Card("Hearts", rank);
//			cards[i++] = new Card("Diamonds", rank);
//			cards[i++] = new Card("Clubs", rank);
//		}
	}
	public void shuffle() {
		Random random = new Random();
		for (int i = 52; i > 0; i--) {
			int j = random.nextInt(i + 1);
			exercise5Card temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	}
	public exercise5Card[] deal(int numCards) {
		if (numCards > cards.length) {
			throw new IllegalArgumentException("Not enough cards in the deck");
		}
		exercise5Card[] hand = new exercise5Card[numCards];
		for (int i = 0; i < numCards; i++) {
			hand[i] = cards[i];
		}
		exercise5Card[] remainingCards = new exercise5Card[cards.length - numCards];
		for (int i = numCards; i < cards.length; i++) {
			remainingCards[i - numCards] = cards[i];
		}
		cards = remainingCards;
		return hand;
	}

}
