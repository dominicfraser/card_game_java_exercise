package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class PlayerTest{

  Player player1;
  Card card1;
  Card card2;

  @Before
  public void before(){
    this.player1 = new Player("Jake");
    card1 = new Card(2, Suit.Clubs);
    card2 = new Card(3, Suit.Spades);
    player1.setHand(card1, card2);
  }

  @Test 
  public void canPrintHand(){
    assertEquals("Two of Clubs, Three of Spades", player1.printHand());
  }

}