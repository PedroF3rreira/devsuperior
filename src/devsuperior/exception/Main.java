package devsuperior.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			String[] names = sc.nextLine().split(" ");
			int index = sc.nextInt();
			
			System.out.println(names[index]);
		}
		catch(InputMismatchException e) {
			System.out.println("Voce deve digitar um intero ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Voce tentou acessar um indice que não existe");
		}
		
		System.out.println("progama terminado");
		sc.close();

	}

}
