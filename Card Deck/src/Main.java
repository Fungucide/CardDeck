import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{

		MyPlayerControllerAI pc = new MyPlayerControllerAI();

		int numberOfPlayers = in.nextInt();
		PlayerID[] ID = new PlayerID[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++)
		{
			ID[i] = new PlayerID();
		}

		ArrayList<Card> aihand = Input();
		ArrayList<Cycle> record = new ArrayList<Cycle>();
		// add cards here
		while (true)
		{
			Cycle c = new Cycle(aihand, otherPlayersInput(ID));
			record.add(c);
			pc.onTurn(record);

		}

	}

	public static ArrayList<Card> Input()
	{

		System.out.println("Number of cards: ");
		int numberOfCards = in.nextInt();
		ArrayList<Card> input = new ArrayList<Card>();
		String split = in.nextLine();
		String[] splited = split.split(" ");
		for (int i = 0; i < numberOfCards; i++)
		{
			input.add(new Card(splited[0], splited[1]));
		}
		Collections.sort(input);
		return input;
	}

	public static Map<PlayerID, ArrayList<Card>> otherPlayersInput(PlayerID[] ID)
	{
		Map<PlayerID, ArrayList<Card>> list = new HashMap<PlayerID, ArrayList<Card>>();
		for (int j = 0; j < ID.length; j++)
		{
			System.out.println("Number of cards: ");
			int numberOfCards = in.nextInt();
			ArrayList<Card> input = new ArrayList<Card>();
			String split = in.nextLine();
			String[] splited = split.split(" ");
			for (int i = 0; i < numberOfCards; i++)
			{
				input.add(new Card(splited[0], splited[1]));
			}
			list.put(ID[j], input);
		}
		return list;
	}
}
