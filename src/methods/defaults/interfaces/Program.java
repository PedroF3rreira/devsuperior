package methods.defaults.interfaces;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantia");
		double amount = sc.nextDouble();
		
		System.out.print("Digite os meses");
		int months = sc.nextInt();
		
		System.out.println("Digite a taxa de juros");
		double intsrestTax = sc.nextDouble();
		
		InterestService is = new UsaInterestService(intsrestTax);
		System.out.println(is.payment( amount, months));

		
		sc.close();
	}

}
