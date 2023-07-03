package generics.application;

import java.util.Scanner;

import generics.services.PrintService;

public class Program {

	public static void main(String[] args) {
		PrintService<Integer> ps = new PrintService<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many values");
		
		int values = sc.nextInt();
		
		while(values > 0) {
			System.out.print("enter number:");
			ps.addValue(sc.nextInt());
			values--;
		}
		
		ps.print();
		
		System.out.println("First value " + ps.first());
		
		sc.close();
	}
}
