package model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Card {

	/* An Enumeration is a good way to ensure a variable can
	 * only hold a specific set of values and no other. */
	public static enum CardSuit {
		HEARTS, // Harten
		DIAMONDS, // Ruiten
		CLUBS, // Klaveren
		SPADES // Schoppen
	};

	public static enum CardValue {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	};

	/* We'll need a map to give the rest of the application a String representation
	 * of the card suit and the card value. */
	private static final Map<CardSuit, String> cardSuitStrings = createSuitString();
	private static final Map<CardValue, String> cardValueStrings = createValueString();

	/* The actual class variables of Card. */
	private CardSuit suit;
	private CardValue value;

	/* Constructor */
	public Card(CardSuit suit, CardValue value) {
		this.suit = suit;
		this.value = value;
	}

	/* Getters and Setters */
	public CardSuit getSuit() {
		return suit;
	}

	public CardValue getValue() {
		return value;
	}
	
	public String getSuitString(){
		return cardSuitStrings.get(this.getSuit());
	}
	
	public String getValueString(){
		return cardValueStrings.get(this.getValue());
	}

	/* A number of private methods to initialize 
	 * the maps cardValueStrings and cardSuitStrings. */
	private static Map<CardSuit, String> createSuitString() {
		Map<CardSuit, String> result = new HashMap<CardSuit, String>();
		result.put(CardSuit.HEARTS, "Hearts");
		result.put(CardSuit.DIAMONDS, "Diamonds");
		result.put(CardSuit.CLUBS, "Clubs");
		result.put(CardSuit.SPADES, "Spades");
		return Collections.unmodifiableMap(result);
	}
	
	private static Map<CardValue, String> createValueString() {
		Map<CardValue, String> result = new HashMap<CardValue, String>();
		result.put(CardValue.ACE, "ace");
		result.put(CardValue.TWO, "2");
		result.put(CardValue.THREE, "3");
		result.put(CardValue.FOUR, "4");
		result.put(CardValue.FIVE, "5");
		result.put(CardValue.SIX, "6");
		result.put(CardValue.SEVEN, "7");
		result.put(CardValue.EIGHT, "8");
		result.put(CardValue.NINE, "9");
		result.put(CardValue.TEN, "10");
		result.put(CardValue.JACK, "jack");
		result.put(CardValue.QUEEN, "queen");
		result.put(CardValue.KING, "king");
		
		return Collections.unmodifiableMap(result);
	}
}
