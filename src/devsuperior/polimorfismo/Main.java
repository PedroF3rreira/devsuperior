package devsuperior.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import devsuperior.entities.Employee;
import devsuperior.entities.OutSourceEmployee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployeers = new ArrayList<>();
		
		System.out.println("Digite o numero de empregados:");
		int numberEmployeers = sc.nextInt();
		
		for(int i=0;i<numberEmployeers;i++) {
			System.out.print("O empregado é terceirizado? s/n");
			String asnew = sc.next();
			
			if(asnew.toLowerCase().equals("s")) {
				System.out.print("Nome: ");
				String name = sc.next();
				
				System.out.print("Horas: ");
				int hour = sc.nextInt();
				
				System.out.print("Valor por hora: ");
				double valuePerHour = sc.nextDouble();
				
				System.out.print("Adicional: ");
				double additionalCharge = sc.nextDouble();
				
				listEmployeers.add(new OutSourceEmployee(name, hour, valuePerHour, additionalCharge));
				
				System.out.println("funcionario adicionado!");
			}else {
				System.out.print("Nome: ");
				String name = sc.next();
				
				System.out.print("Horas: ");
				int hour = sc.nextInt();
				
				System.out.print("Valor por hora: ");
				double valuePerHour = sc.nextDouble();
			
				listEmployeers.add(new Employee(name, hour, valuePerHour));
				
				System.out.println("funcionario adicionado!");
			}
		}
		System.out.println("Lista de funcionarios:");
		for(Employee employee : listEmployeers) {
			System.out.printf("Nome: %s ", employee.getName());
			System.out.printf("Pagamento: R$%.2f", employee.payment());
			System.out.println();
		}
		sc.close();

	}

}
