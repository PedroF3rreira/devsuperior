package lambda;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("tv", 50.69));
		list.add(new Product("tablete", 185.69));
		list.add(new Product("kit placa mãe e processador i56500", 485.69));
		
		list.removeIf(Product::nonStaticPredicateProduct);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
