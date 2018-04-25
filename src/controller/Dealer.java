package controller;

import javax.swing.SwingUtilities;

import view.MyGui;
import model.Deck;
import model.Hand;

public class Dealer {

	private Deck 	deck = new Deck();
	private Hand 	hand = new Hand();
	private MyGui 	myGui;

	public Dealer() {
		deck.shuffle();
		
		myGui = new MyGui(deck, hand, this);
		/* The construction below is a more correct way of
		 * starting up your GUI. Why this is so, you will
		 * find out later this course. */
		Runnable myGuiThread = new Runnable(){
			@Override
			public void run() {
				myGui.create();
			}
		};
		
		SwingUtilities.invokeLater(myGuiThread);
	}

	public void deal(int amount) {
		for (int x = 0; x < amount && deck.getDeckSize() > 0; x++) {
			hand.addCard(deck.getTopCard());
		}
	}
}
