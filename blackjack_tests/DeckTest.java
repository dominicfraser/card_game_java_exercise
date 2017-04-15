package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class DeckTest{

  Card aceOfSpades;
  Deck deck;

  @Before
  public void before(){
    this.aceOfSpades = new Card(1, Suit.Spades);
    this.deck = new Deck();
  }

  @Test
  public void deckIs52Cards(){
    this.deck.buildDeck();
    assertEquals( 52, this.deck.getDeck().size() );
  }

  @Test 
  public void containsStarterCard(){
    this.deck.buildDeck();
    assertEquals( true,this.deck.hasCard(this.aceOfSpades) );
  }

}