package inheritance;
import java.util.Scanner;
class AmountCalc{
	public void deposit(int amount , int balance) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("amount has been deposit \nYour current balance is "+balance);
		} else {
			System.err.println("Invalid amount has been provided.");
			
		}


	}

}
class ATM extends AmountCalc {
	
}
public class SingleInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your deposit amount");
		int amount = sc.nextInt();
		ATM a = new ATM();
		a.deposit(amount, 1000);
		
	}
}
