package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class DeckTest{

  Card aceOfSpades;
  Deck deck;

  @Before
  public void before(){
    aceOfSpades = new Card(1, Suit.Spades);
    deck = new Deck();
  }

}