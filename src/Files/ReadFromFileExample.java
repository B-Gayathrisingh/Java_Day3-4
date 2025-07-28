package Files;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("output1.txt");
			int character;
			while((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			
			//output1.txt = Welcome
		}
		catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
