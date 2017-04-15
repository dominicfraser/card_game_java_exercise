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
    this.deck.buildDeck();
  }

  @Test
  public void deckIs52Cards(){
    assertEquals( 52, this.deck.getDeck().size() );
  }

  @Test 
  public void containsStarterCard(){
    assertEquals( true,this.deck.hasCardOfType(this.aceOfSpades) );
  }

  @Test
  public void cardInDeckHasDescription(){
    String description_example = "test";
    String description = this.deck.getDeck().get(3).description();
    assertEquals( description_example.getClass(),description.getClass() );
  }  
  
}