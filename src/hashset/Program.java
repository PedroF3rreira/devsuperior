package hashset;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Tv lcd tela plana");
		set.add("kit h61 i5 2400");
		set.add("fonte atx 230w real");
		
		System.out.println(set.contains("Tv lcd tela plana"));
		
		for(String item : set) {
			System.out.println(item);
		}

	}

}
