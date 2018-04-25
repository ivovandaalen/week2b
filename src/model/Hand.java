package model;

import java.util.ArrayList;

public class Hand{
	private ArrayList<Card> myCards;

	public Hand() {
		myCards = new ArrayList<Card>();
	}

	public void addCard(Card card) {
		if (card != null) {
			myCards.add(card);
		}
	}

	public ArrayList<Card> getCards() {
		return myCards;
	}
}
