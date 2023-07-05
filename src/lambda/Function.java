package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("tv", 180.0));
		list.add(new Product("Tablet", 150.0));
		list.add(new Product("Celular", 100.0));
		
		//List<String> results = list.stream().map(new ProductToupperCase()).collect(Collectors.toList());
		//List<String> results = list.stream().map(Product::productNameToupperCase).collect(Collectors.toList());
		
		List<String> results = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		results.forEach(System.out::println);
	}

}
