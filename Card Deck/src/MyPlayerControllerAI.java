import java.util.ArrayList;

public class MyPlayerControllerAI implements PlayerController
{

	@Override
	public Move onTurn(ArrayList<Cycle> CL)
	{
		return null;
	}

	public void Organize(ArrayList<Card> Hand)
	{
		Boolean[] EqualsFive = new Boolean[4];
		Boolean[] GreaterThanFive = new Boolean[4];
		int SuitCount;
		for (int i = 0; i < 4; i++)
		{
			SuitCount = 0;
			for (Card card : Hand)
			{
				if (card.suit == i)
				{
					SuitCount++;
				}
			}
			if (SuitCount == 5)
			{
				EqualsFive[i] = true;
			} else if (SuitCount > 5)
			{
				GreaterThanFive[i] = true;
			} else
			{
				EqualsFive[i] = false;
				GreaterThanFive[i] = false;
			}
		}

		int value = 0;
		int count = 0;
		for (Card card : Hand)
		{
			if (card.value == value)
			{
				value++;
				count++;
			} else if (card.value > value)
			{
				count = 0;
			}
		}

	}
}
