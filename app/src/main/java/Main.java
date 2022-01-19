public class Main {
	public static void main(String[] args) {
		int[] roomCounts = new int[6];
		int[] houseCount = {4, 12, 3, 6, 8}; // например домов в поселке

		roomCounts[0] = 5;
		roomCounts[1] = 35;
		roomCounts[2] = 34;
		roomCounts[3] = 45;

		for (int i = 0; i < roomCounts.length; i++)
		{
			System.out.println(roomCounts[i]);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < houseCount.length; i++)
		{
			System.out.println(roomCounts[i]);
		}
		System.out.println("-----------------------");
		String[] colors = {"red", "green", "blue", "yellow"};

		System.out.println("вывод массива наоборот");
		for (int i = colors.length - 1; i >= 0; i--)
		{
			System.out.println(colors[i]);
		}
		System.out.println("----------пропуск повторяющихся слов-------------");
		String textSplit = "Где желает знать Каждый Каждый сидит фазан";
		String[] textSplitWords = textSplit.split("\\s+");
		for (int i = 0; i < textSplitWords.length; i++)
		{
			if (i > 0 && textSplitWords[i].equals(textSplitWords[i - 1]))
			{
				continue;
			}
			System.out.println(textSplitWords[i]);
		}

		System.out.println("-----------------------");
		System.out.println("новый вид вывода массива");
		for (String colorWord : colors)
			System.out.println(colorWord);

		System.out.println("-----------------------");
		String text  = "Каждый охотник желает знать, где сидит фазан";
		String[] colorsSplit = text.split(",?\\s+");

		for (int i = 0; i < colorsSplit.length; i++)
		{
			System.out.println(colorsSplit[i]);
		}

//		int[] ticketNumbers = new int[1000];
//		int[] winTickets = new int[10];
//		for (int i = 0; i < ticketNumbers.length; i++)
//		{
//			int value = 1_000_000 + (int) Math.round(1000_000 * Math.random());
//			ticketNumbers[i] = value;
//			if (i % 100 == 0)
//			{
//				winTickets[i / 100] = value;
//			}
//			System.out.println(value);
//		}
//		System.out.println("win tickets number are: ");
//		for (int winTicketNumber : winTickets)
//			System.out.println(winTicketNumber);

	}
}
