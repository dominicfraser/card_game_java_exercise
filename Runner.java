import blackjack.*;

public class Runner{
  public static void main(String[] args){

  Game game = new Game();
  int amountOfPlayers = game.getHowManyPlayers();
  game.createPlayers(amountOfPlayers);

  game.deal();
  Player winner = WinChecker.simpleWin(game);
  System.out.println("The winner is: " + winner.getPlayerName() + "!");


  }
}