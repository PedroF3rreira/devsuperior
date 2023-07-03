package generics.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import devsuperior.entities.Product;
import generics.services.CalculateService;

public class Program2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] product = line.split(",");
				list.add(new Product(product[0], Double.parseDouble(product[1])));
				line = br.readLine();
			}
			Product x = CalculateService.max(list);
			System.out.println(x);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
