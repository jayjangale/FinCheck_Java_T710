package fileHandling;
import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\jayja\\OneDrive\\Pictures\\Greeting.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}

	}

}
