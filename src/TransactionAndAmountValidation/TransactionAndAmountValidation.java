package TransactionAndAmountValidation;
import java.util.Scanner;

public class TransactionAndAmountValidation {

	public static void main(String[] args) {
		int balance = 100000;
		Scanner sc = new Scanner(System.in); // here we store object into the variable for multiple reuse.
		System.out.println("Enter your withdrawal Amount : ");
		int withdrawal = sc.nextInt();
		if (withdrawal > 0) {
			 
			if (balance > withdrawal) {
				System.out.println("Transaction Successful");
			} else { 
				System.err.println("Insufficient Balance");
			}
		} else {
			System.err.println("Invalid transaction amount");
		}

	}

}
