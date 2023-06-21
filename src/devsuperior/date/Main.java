package devsuperior.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Date instant = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		
		try {
			Date newDate = sdf.parse("25/10/2023");
			System.out.println(newDate);
			System.out.println(sdf.format(newDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}
