package view;

import javax.swing.JFrame;

import controller.Dealer;

import model.Deck;
import model.Hand;

@SuppressWarnings("serial")
public class MyGui extends JFrame {
	
	
	public MyGui(Deck deck, Hand hand, Dealer dealer){
		this.setTitle("Card Dealer");
		MyContentPane myContent = new MyContentPane(deck, hand, dealer);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(myContent);

	}
	
	public void create(){
		this.pack();
		this.setVisible(true);
	}
}
