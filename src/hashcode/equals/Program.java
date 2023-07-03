package hashcode.equals;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Pedro", "pedro@gmail.com");
		Client c2 = new Client("Pedro", "elias@gamil.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}
