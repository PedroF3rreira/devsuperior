package interfaces.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import interfaces.entities.Car;
import interfaces.entities.CarRental;
import interfaces.services.RentalService;
import interfaces.services.UsaTaxService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modeleo do carro");
		String model = sc.nextLine();
		Car car = new Car(model);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Digite a saida do carro");
		Date out = sdf.parse(sc.nextLine());
		
		System.out.println("Digite a entrada do carro");
		Date in = sdf.parse(sc.nextLine());
		
		System.out.println("digite o preço por hora");
		double pricePerHour = sc.nextDouble();
		
		System.out.println("digite o preço por dia");
		double pricePerday = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerday, new UsaTaxService());
		
		CarRental carRental = new CarRental(out, in, car);
		
		System.out.println("Resumo da nota:");
		rentalService.processInvoice(carRental);
		
		System.out.printf("pagamento basico: %.2f\n",carRental.getInvoice().getBasicPayment());
		System.out.printf("Taxa %.2f\n", carRental.getInvoice().getTax());
		System.out.printf("Total %.2f\n", carRental.getInvoice().totalPayment());
		
		sc.close();

	}

}
