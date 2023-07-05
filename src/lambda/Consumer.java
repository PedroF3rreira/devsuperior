package lambda;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 180.0));
		list.add(new Product("Tablet", 150.0));
		list.add(new Product("Celular", 100.0));

		list.forEach(Product::staticPriceUpdate);

		list.forEach(System.out::println);
	}

}
