import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input step : ");
		int step = scanner.nextInt();
		System.out.print("input endStep : ");
		int endStep = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= step; i++) {
			Gugudan.printGugudan(Gugudan.calculator(i, endStep));	
		}
	}
}
