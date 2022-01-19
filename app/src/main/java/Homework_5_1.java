public class Homework_5_1 {
	public static void main(String[] args) {
		String text = "Каждый охотник желает знать, где сидит фазан.";
		String[] textSplit = text.split(",?\\s+");
		for (int i = textSplit.length - 1; i >= 0; i--)
		{
			System.out.println(textSplit[i]);
		}

		float[] person = new float[30];
		float middle = 0;
		for (int i = 0; i < person.length; i++)
		{
			float temp = 32 + (float) (10 * Math.random());
			person[i] = temp;
			System.out.println(person[i]);
			middle += person[i];
		}
		System.out.println("Средняя температура пациентов = " + middle / person.length);

	}
}
