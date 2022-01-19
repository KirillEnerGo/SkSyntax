public class MassOfMass {
	public static void main(String[] args) {
		boolean[] array = new boolean[5];
		System.out.println(array[0]);
		String[] stringArray = new String[10];
		System.out.println(stringArray[4]);

		int[][] studentMarks = {
				{2, 3, 4, 5, 3, 5},
				{4, 5, 3, 4, 5, 5, 5, 5, 5},
				{3, 4, 4, 4, 5, 5},
				{4, 4, 5, 5, 5, 4, 5, 5}
		};
		for (int i = 0; i < studentMarks.length; i++)
		{
			System.out.println("Class " + i + " (" + studentMarks[i].length +
					" students)");
			for (int j = 0; j < studentMarks[i].length; j++)
			{
				System.out.println("\t" + studentMarks[i][j]);
			}
		}
	}
}
