package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class TransactionValidation {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\jayja\\Downloads\\transactionsfromjantofeb2024.csv");
		FileWriter wr = new FileWriter("C:\\Users\\jayja\\OneDrive\\Pictures\\invalid_transaction.txt",true);
		Scanner sc = new Scanner(f);
		sc.nextLine();
		while (sc.hasNext()) {
			String[] data = sc.nextLine().split(",");
			double amount = Double.parseDouble(data[3]);
			if (amount < 1) {
				System.out.println(data[1]+" amount is invalid and amount is "+amount);
				wr.append(data[1]+" amount is invalid and amount is "+amount+"\n");
				
			}
		}
		wr.close();
		

	}

}
