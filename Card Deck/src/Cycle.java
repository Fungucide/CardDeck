import java.util.ArrayList;
import java.util.Map;

public class Cycle
{
	public final Map<PlayerID, ArrayList<Card>>	playerMoves;
	public final ArrayList<Card>				hand;

	public Cycle(ArrayList<Card> hand, Map<PlayerID, ArrayList<Card>> playerMoves) {
		this.playerMoves = playerMoves;
		this.hand = hand;
	}
}
