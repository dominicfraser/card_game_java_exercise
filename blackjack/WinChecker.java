package blackjack;

public class WinChecker{

public static Player simpleWin(Game game){
  Player winningPlayer = game.getPlayers().get(0);

  for(Player player : game.getPlayers() )
    if(winningPlayer.sumHand() < player.sumHand()){
        winningPlayer = player;
    }
  return winningPlayer;
}

}