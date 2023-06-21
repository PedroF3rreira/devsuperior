package devsuperior.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import devsuperior.entities.Order;
import devsuperior.entities.Product;
import devsuperior.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("Bola preta 8", 10.8);
		Product p2 = new Product("Bola vede 7", 10.8);
		Product p3 = new Product("Bola vermelho 5", 10.8);
		Product p4 = new Product("Bola marrom 1", 10.8);
		
		List<Product> products = new ArrayList<>();
		products.add(p4);
		products.add(p3);
		products.add(p2);
		products.add(p1);
		
		List<Product> orderItem = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Pesquise um prduto para o pedido pelo id:");
			int search = sc.nextInt();
			
			List<Product> result = products.stream().filter(product -> product.getId() == search)
					.collect(Collectors.toList());
			
			if (result.size() > 0) {
				System.out.println("Deseja adicionar esse produto s/n?");
				System.out.println(result.get(0).toString());
				sc.nextLine();
				String asnewsc = sc.nextLine();

				if (asnewsc.equals("s")) {
					orderItem.add(result.get(0));
					//Order order = new Order(orderItem, result.get(0).getPrice() , OrderStatus.PEDDING_PAYMENT);
					System.out.print("Produto adicionado com exito!");
					
					//System.out.println("Status do pedido" + order.getStatus());

				} else {
					System.out.println("Aperte qualquer tecla para continuar");
					break;

				}

			} else {
				System.out.println("Produto não foi encntrado");
			}

		}

	}

}
