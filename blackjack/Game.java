package blackjack;

import java.util.ArrayList;
import java.util.Scanner; 

public class Game{

  private ArrayList<Player> players = new ArrayList<Player>();
  private Deck deck;

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

  public int getHowManyPlayers(){
    Scanner reader = new Scanner(System.in);
    System.out.println("How many people wish to play? ");
    int input = reader.nextInt();

    return input;
  }

  public void createPlayers(int amountOfPlayers){
    for(int i=1;i<amountOfPlayers;i++){
      System.out.println("Player " + Integer.toString(i) + ", Enter Name: ");
      Scanner scanner = new Scanner(System.in);
      Player player = new Player(scanner.nextLine());
      addPlayer(player);
    }
  }


}