package operator;

public class TransactionCalculation {

	public static void main(String[] args) {
		int balance = 50000;
		int Amount = 45000;
		
        // balance = 50000 - 45000
		// balance = 5000
		
		balance = balance - Amount;
		
		System.out.println("Anil kumar current balance is "+balance);
		
		int incentive = 5000;    //HR
		
		balance = balance + incentive;
		
		System.out.println("Anil kumar current update balance is "+balance);
		
	}

}