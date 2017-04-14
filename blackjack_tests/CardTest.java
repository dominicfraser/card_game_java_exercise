package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest{

  Card aceOfSpades;

  @Before
    public void before(){
      aceOfSpades = new Card(1, Suit.SPADES);
    }



}

// javac ./**/*.java
// java blackjack_tests.CardTest