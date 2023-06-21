package devsuperior.entities;

public class Product {
	private Integer id;
	private String description;
	private Double price;
	private static Integer lastId = 0;

	public Product(String description, Double price) {
		this.description = description;
		this.price = price;
		lastId++;
		this.id = lastId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "produto: \n" + this.description +"\n"+ this.price;
	}
	
	
}
