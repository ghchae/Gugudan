import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gugudan Start");
		System.out.println("-------------");
		System.out.print("출력할 구구단을 입력해주세요 : ");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(number + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}
}
