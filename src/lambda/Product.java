package lambda;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Product o) {
		return this.name.toUpperCase().compareTo(o.getName().toUpperCase());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public static boolean staticPredicateProduct(Product p) {
		return p.getPrice() >= 100.00;
	}

	public boolean nonStaticPredicateProduct() {
		return price >= 100.00;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	public static String productNameToupperCase(Product p) {
		return p.getName().toUpperCase();
	}
}
