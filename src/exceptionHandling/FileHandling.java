package exceptionHandling;

import java.io.File;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		
		try { 
			
			File f = new File("C:\\Users\\jayja\\Downloads\\transactionsfromjantofeb2024.csv");
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		

	}

}
