package blackjack;

public class Card{

  private int rank;
  private Suit suit;

  public Card(int rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public int getRank(){
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public String description(){
    String[] title = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    return title[this.rank -1] + " of " + this.suit.toString();

  }
}