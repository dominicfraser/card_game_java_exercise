package blackjack_tests;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class GameTest{

  Player player1;
  Player player2;
  Game game;

  @Before 
  public void before(){
    this.player1 = new Player("Jake");
    this.player2 = new Player("Sam");
    this.game = new Game();
    this.game.addPlayer(player1);
    this.game.addPlayer(player2);
  }

  @Test
  public void canAddPlayers(){
    assertEquals( 2,this.game.getPlayers().size() );
  }

  @Test
  public void canDealtoHand(){
    this.game.deal();
    assertNotNull(this.player1.getHand()[0]);
  }

}