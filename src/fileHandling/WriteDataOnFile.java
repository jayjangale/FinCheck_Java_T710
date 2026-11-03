package fileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataOnFile {

	public static void main(String[] args) throws Exception {
		
		FileWriter write = new FileWriter("C:\\Users\\jayja\\OneDrive\\Pictures\\Greeting.txt",true);
		write.append("\nmast hu mai");
		write.close();    // write --> file add
		

	}

}
