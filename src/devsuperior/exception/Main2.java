package devsuperior.exception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import devsuperior.exception.models.entities.Reservation;

public class Main2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Numero do quarto: ");
			int roomNumber = sc.nextInt();
			
			System.out.print("Data de check-in:");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.print("Data de check-out:");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation.toString());
			
			System.out.println();
			System.out.println("entre com a data para atualizar reserva:");
			System.out.print("Check-in:");

			System.out.print("Data de check-in:");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Data de check-out:");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Menssagem erro: " + e.getMessage());
		}
		
	}

}
