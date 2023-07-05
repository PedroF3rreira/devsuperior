package lambda;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
	/**
	 * adicona flexbilidade ao método pois agora podemos colocar inumeras condiçoes atraves do
	 * predicate
	 * **/
	public double filterSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for(Product p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
