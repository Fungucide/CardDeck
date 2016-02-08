public class Card implements Comparable<Card>
{
	public int			temp;
	public final int	suit;
	public final int	value;

	public Card(String value, String suit) {
		this.suit = Integer.parseInt(suit);
		try
		{
			temp = Integer.parseInt(value);
		} catch (NumberFormatException e)
		{
			if (value.equals("j"))
			{
				temp = 11;
			} else if (value.equals("q"))
			{
				temp = 12;
			} else if (value.equals("k"))
			{
				temp = 12;
			}

		}
		this.value = temp;
	}

	@Override
	public int compareTo(Card o)
	{
		int a = value * 4 + suit;
		int b = o.value * 4 + o.suit;
		return a - b;
	}
}