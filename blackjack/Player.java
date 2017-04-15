package blackjack;

public class Player{

  private String player_name;
  private Card[] hand;

  public Player(String player_name){
    this.player_name = player_name;
    this.hand = new Card[2];
  }

}