package devsuperior.herenca;

import devsuperior.entities.Account;
import devsuperior.entities.BussinessAccount;

public class Main {
	public static void main(String[] args) {
		BussinessAccount b_account = new BussinessAccount(1258,"Pedro",100.0, 100.0);
		
		System.out.println("Detalhas da conta:");
		System.out.println(b_account.getHolder());
		System.out.println(b_account.getLimit());
		System.out.println("Saldo: " + b_account.getBalence());
		b_account.deposit(300);
		System.out.println("saldo apos o deposito: " + b_account.getBalence());
		b_account.withdraw(100);
		System.out.println("saldo depois do saque: " + b_account.getBalence());
	}
}
