package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import devsuperior.entities.Product;

public class Program {

	public static void main(String[] args) {
		Map<String, String> dict = new TreeMap<>();
		dict.put("username", "pedro");
		dict.put("password", "123");
		dict.put("email", "pedro@gmail.com");
		
		Map<Product, Double> itemOrder = new HashMap<>();
		
		itemOrder.put(new Product("Tv", 258.0), 3.0);
		itemOrder.put(new Product("Tablet", 189.0), 6.0);
		
		System.out.println(itemOrder);
		
		System.out.println(dict);

	}

}
