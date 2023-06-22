package devsuperior.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import devsuperior.entities.OrderItem;
import devsuperior.entities.Product;

public class Execice {

	public static void main(String[] args) {
		String path = "c:\\products";
		List<OrderItem> itensSumary = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path+"\\products.csv"))){
			String line = br.readLine();
			
			while(line != null) {
				String[] itens = line.split(",");
				
				String description = itens[0];
				double price = Double.parseDouble(itens[1]);
				int quantity = Integer.parseInt(itens[2]);
				
				Product p = new Product(description, price);
				
				itensSumary.add(new OrderItem(quantity, price, p));
				
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\out\\sumary.csv", true))) {
				for(OrderItem item : itensSumary) {
					String out= "";
					out += item.getProduct().getDescription()+",";
					out += item.suTotal().toString();
					
					bw.write(out);
					bw.newLine();
					System.out.println("gravando linhas no arquivo...");
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
