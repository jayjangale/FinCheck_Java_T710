package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AccountDetail {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\jayja\\Downloads\\Data - Sheet1.csv");
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			String[] data = sc.nextLine().split(",");
			
			Integer i = Integer.parseInt(data[1]);
			
			if (i>0) {
				System.out.println(data[0]+" transaction can be performed");
			} else { 
				System.out.println(data[0]+" transaction can't be performed");
			}
		}
		
		

	}

}
