public class Gugudan {
	public static int[] calculator(int step, int endStep) {
		int[] gugudanArray = new int[endStep];
		for (int j = 0; j < gugudanArray.length; j++) {
			gugudanArray[j] = step * (j + 1);
		}
		return gugudanArray;
	}
	public static void printGugudan(int[] gugudanArray) {
		for (int i = 0; i < gugudanArray.length; i++) {
			System.out.print(gugudanArray[i]);
			if(i != (gugudanArray.length - 1)) {
				System.out.append(", ");
			}
		}
		System.out.println();
	}
}
