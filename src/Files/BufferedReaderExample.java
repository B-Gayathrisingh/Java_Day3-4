package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		//try with resources block
		try(BufferedReader br = new BufferedReader(new FileReader("output1.txt"))) {
//			String line = br.readLine();
//			System.out.println("Read Line: "+line);
			String line;
			while((line = br.readLine())!=null) {
				System.out.println("Line: "+line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}
