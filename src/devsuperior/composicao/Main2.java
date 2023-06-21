package devsuperior.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import devsuperior.entities.Cliente;
import devsuperior.entities.Order;
import devsuperior.entities.OrderItem;
import devsuperior.entities.Product;
import devsuperior.entities.enums.OrderStatus;

public class Main2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter with Client:");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.println("BirthDay");
		String birthDay = sc.next();
		Date bDate = sdf.parse(birthDay);
		
		Cliente client = new Cliente(name, email, bDate);
		
		System.out.println("Enter order informations");
		
		System.out.print("Order Status");
		String orderStatus  = sc.next();
		
		Order order = new Order(OrderStatus.valueOf(orderStatus));
		order.setClient(client);
		
		System.out.print("How many items to this order?");
		int numberItens  = sc.nextInt();
		
		for(int i=0;i<numberItens;i++) {
			System.out.printf("Enter #%d items: ", i);
			
			System.out.println("Produc name: ");
			String productName = sc.next();
			
			System.out.println("Produc price: ");
			double productprice = sc.nextDouble();
			
			System.out.println("Produc quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productprice );
			
			order.addItem(new OrderItem(productQuantity, product.getPrice(), product));
			
		}
		
		
		System.out.println("Order sumary: ");
		System.out.print("Cliente: ");
		System.out.print(" "+order.getClient().getName());
		System.out.print(" "+order.getClient().getEmail());
		System.out.println(" "+order.getClient().getBirthDay());
		
		System.out.println("Order status: " + order.getStatus());
		
		System.out.println("List of items the order:");
		for(OrderItem item : order.getOrderItens()) {
			System.out.println(item.getProduct().getDescription());
			System.out.println(item.getProduct().getPrice());
			System.out.println(item.suTotal());
		}
		
		System.out.println("");
		System.out.println("Total order " + order.total());
		sc.close();
	}

}
