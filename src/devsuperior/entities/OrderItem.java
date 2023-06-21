package devsuperior.entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Double suTotal() {
		double subTotal = 0.0;
		return subTotal += product.getPrice() * this.quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	
}
