package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest{

  Card aceOfSpades;

  @Before
    public void before(){
      aceOfSpades = new Card(1, Suit.Spades);
    }

    @Test
    public void cardHasRank(){
      assertEquals( 1,aceOfSpades.getRank() );
    }

    @Test
    public void cardHasSuit(){
      assertEquals( Suit.Spades, aceOfSpades.getSuit() );
    }

    @Test
    public void hasDescription(){
      assertEquals( "Ace of Spades",aceOfSpades.description() );
    }

}

// javac ./**/*.java
// java blackjack_tests.CardTest