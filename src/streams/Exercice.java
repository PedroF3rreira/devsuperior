package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\employee.csv";
		
		List<Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(";");
				
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			 double sum = list.stream().filter(e -> e.getName().charAt(0) == 'm')
			 .map(e -> e.getSalary())
			 .reduce(0.0, (x, y) -> x + y);
			 
			 System.out.println(sum);
			 
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
