package blackjack;

import java.util.ArrayList;

public class Game{

  private ArrayList<Player> players = new ArrayList<Player>();
  private Deck deck;
  // private WinChecker winChecker = new WinChecker();

  public Game(){
    this.deck = new Deck();
    this.deck.buildDeck();
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public ArrayList<Player> getPlayers(){
    return this.players;
  }

  public void deal(){
    for(Player player : this.players){
      player.setHand(this.deck.getDeck().get(0), this.deck.getDeck().get(1));
      this.deck.getDeck().remove(0);
      this.deck.getDeck().remove(0);
    }
  }


}