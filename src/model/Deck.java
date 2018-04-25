package model;

import java.util.ArrayList;
import java.util.Collections;

import model.Card.CardSuit;
import model.Card.CardValue;


public class Deck{
	private ArrayList<Card> myDeck = new ArrayList<Card>();

	public Deck() {
		generateDeck();
	}

	public void shuffle(){
		Collections.shuffle(myDeck);
	}
	
	public int getDeckSize(){
		return myDeck.size();
	}
	
	/* Removes the top card from the deck and returns
	 * that card to the caller. */
	public Card getTopCard(){
		Card retCard = null;
		
		if(myDeck.size()>0){
			retCard = myDeck.get(myDeck.size()-1);
			myDeck.remove(retCard);
		}
		
		return retCard;
	}
	
	/* Method to generate a deck of 52 cards. */
	private void generateDeck() {
		myDeck.add(new Card(CardSuit.SPADES, CardValue.ACE));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.TWO));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.THREE));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.FOUR));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.FIVE));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.SIX));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.SEVEN));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.EIGHT));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.NINE));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.TEN));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.JACK));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.QUEEN));
		myDeck.add(new Card(CardSuit.SPADES, CardValue.KING));

		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.ACE));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.TWO));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.THREE));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.FOUR));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.FIVE));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.SIX));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.SEVEN));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.EIGHT));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.NINE));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.TEN));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.JACK));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.QUEEN));
		myDeck.add(new Card(CardSuit.DIAMONDS, CardValue.KING));

		myDeck.add(new Card(CardSuit.HEARTS, CardValue.ACE));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.TWO));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.THREE));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.FOUR));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.FIVE));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.SIX));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.SEVEN));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.EIGHT));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.NINE));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.TEN));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.JACK));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.QUEEN));
		myDeck.add(new Card(CardSuit.HEARTS, CardValue.KING));

		myDeck.add(new Card(CardSuit.CLUBS, CardValue.ACE));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.TWO));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.THREE));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.FOUR));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.FIVE));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.SIX));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.SEVEN));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.EIGHT));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.NINE));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.TEN));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.JACK));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.QUEEN));
		myDeck.add(new Card(CardSuit.CLUBS, CardValue.KING));
	}
}
