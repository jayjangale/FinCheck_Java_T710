package ConditionalStatement;
import java.util.Scanner;

public class CardNumber {

	public static void main(String[] args) {
		int balance = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your card number : ");
		long cn = sc.nextLong();
		if (cn==112233441) {
			
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			
			if (pin==1234) {
				System.out.println("transaction successful");
			} else {
				System.out.println("pin incorrect");
			}
		} else {
			System.out.println("Card not found");
		}

	}

}
