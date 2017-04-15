package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public void buildDeck(){
    for (int i=1; i<14; i++) {
      for(Suit suit : Suit.values()){
        deck.add(new Card(i, suit));
      }
    }
    shuffleDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public boolean hasCardOfType(Card card){
    for(Card card_in_deck : this.deck){
      if(card_in_deck.getSuit() == card.getSuit() && card_in_deck.getRank() == card.getRank() ){
        return true;
        }
      }
    return false;
  }

  public Card findCardByDescription(String description){
    for(Card card_in_deck : this.deck){
      if(card_in_deck.description() == description){
        return card_in_deck;
      }
    }
    return null;
  }

  

}