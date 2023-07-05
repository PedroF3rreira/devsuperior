package lambda;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 125.69));
		list.add(new Product("Tablet", 12.69));
		list.add(new Product("Celular", 25.69));
		list.add(new Product("Alavanca preta", 25.69));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product prod : list) {
			System.out.println(prod);
		}

	}

}
