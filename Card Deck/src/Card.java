public class Card implements Comparable<Card>
{
	public final int	suit;
	public final int	value;

	public Card(int value, int suit) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public int compareTo(Card o)
	{
		int a = value * 4 + suit;
		int b = o.value * 4 + o.suit;
		return a - b;
	}
}