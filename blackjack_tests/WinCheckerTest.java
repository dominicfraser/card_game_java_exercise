package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class WinCheckerTest{

  Card aceOfSpades;
  Card twoOfSpades;
  Card threeOfSpades;
  Card fourOfSpades;
  Player player1;
  Player player2;
  Game game;

  @Before 
  public void before(){
    this.aceOfSpades = new Card(1, Suit.Spades);
    this.twoOfSpades = new Card(2, Suit.Spades);
    this.threeOfSpades = new Card(3, Suit.Spades);
    this.fourOfSpades = new Card(4, Suit.Spades);
    this.player1 = new Player("Jake");
    this.player2 = new Player("Sam");
    this.player1.setHand(aceOfSpades, twoOfSpades);
    this.player2.setHand(threeOfSpades,fourOfSpades);
    this.game = new Game();
    this.game.addPlayer(player1);
    this.game.addPlayer(player2);
  }

  @Test
  public void simpleWin(){
    assertEquals( player2,WinChecker.simpleWin(this.game) );
  }

}