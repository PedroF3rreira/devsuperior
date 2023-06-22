package devsuperior.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		String[] lines = new String[] {"Ola", "Bom dia", "tudo bem"};
		String path = "c:\\Lap-Cliente\\arq.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
