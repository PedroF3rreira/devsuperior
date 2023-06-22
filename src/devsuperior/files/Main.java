package devsuperior.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		File file = new File("c:\\Lap-Cliente\\arquivo.txt");
		try {
			if (file.exists()) {
				System.out.println("Arquivo existe");
				System.out.println(file.getCanonicalPath());

				sc = new Scanner(file);
				
				if(file.canRead()) {
					while (sc.hasNextLine()) {
						System.out.println(sc.nextLine());
					}
				}
				else {
					System.out.println("arquivo não pode ser lido");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}

	}

}
