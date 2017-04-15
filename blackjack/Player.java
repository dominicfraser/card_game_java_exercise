package blackjack;

public class Player{

  private String player_name;
  private Card[] hand;

  public Player(String player_name){
    this.player_name = player_name;
    this.hand = new Card[2];
  }

  public void setHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }

  public Card[] getHand(){
    return this.hand;
  }

  public String getPlayerName(){
    return this.player_name;
  }

  public String printHand(){
    return this.hand[0].description() + ", " + this.hand[1].description();
  }

  public int sumHand(){
    return this.hand[0].getRank() + this.hand[1].getRank();
  }

}