package devsuperior.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import devsuperior.entities.Departament;
import devsuperior.entities.HourContract;
import devsuperior.entities.Worker;
import devsuperior.entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Worker w1 = new Worker("pedro", WorkerLevel.JUNIOR, 1000.00, new Departament("back-end"));
		
		int count = 1;
		
		while (count > 0) {
			System.out.println("adicione um contrato para o funcionario");
			System.out.println("data do contrato DD/MM/YYYY:");
			
			String date = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFormat = sdf.parse(date);
			
			System.out.println("horas do contrato:");
			int hour = sc.nextInt();
			
			System.out.println("Valor da hora:");
			double valueHour = sc.nextDouble();
			
			HourContract contract = new HourContract(dateFormat, valueHour, hour);
			w1.addContract(contract);
			
			System.out.println("Deseja adicionar mais um contato ou remover c/r digite qualquer letra para parar?");
			sc.nextLine();
			String asnew = sc.nextLine();
			
			if(asnew.toLowerCase().equals("c")) {
				count = 1;
			}
			else if(asnew.toLowerCase().equals("r")){
				System.out.println("Contrato com data (" + sdf.format(contract.getDate()) + ")foi removido");
				w1.removeContract(contract);
			}
			else {
				count = 0;
			}
		}
		
		System.out.println("Digite um mês para ver o salario:");
		int month = sc.nextInt();
		
		System.out.println("Digite o ano para ver o salario:");
		int year = sc.nextInt();
		
		System.out.println(w1.income(year, month));
		sc.close();

	}

}
