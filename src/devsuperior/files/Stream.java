package devsuperior.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stream {

	public static void main(String[] args) {
		
		String path = "c:\\Lap-Cliente\\arquivo.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			try {
//				if (fr != null) {
//					fr.close();
//				}
//				if (br != null) {
//					br.close();
//				}
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		

	}

}
