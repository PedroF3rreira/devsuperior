package hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Exercicies {

	public static void main(String[] args) {
		
		Set<LogUser> logSet = new TreeSet<>();
		String path = "C:\\log.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				//System.out.println(line);
				String[] fields = line.split(" ", 2);
				Date moment = Date.from(Instant.parse(fields[1]));
				
				logSet.add(new LogUser(fields[0], moment));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + logSet.size());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
