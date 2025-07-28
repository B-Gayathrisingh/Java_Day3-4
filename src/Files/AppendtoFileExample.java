package Files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendtoFileExample {

	public static void main(String[] args) {
		try {
			FileWriter write1 = new FileWriter("output1.txt",true);
			write1.write("\nThis is an appended line.");
			write1.close();
			System.out.println("Successfully appended to the file.");
		}
		catch(IOException e) {
			System.out.println("An Error occured.");
			e.printStackTrace();
		}

	}

}
