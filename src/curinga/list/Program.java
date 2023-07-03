package curinga.list;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		//List<Object> myObjects = new ArrayList<>();
		//List<String> myStrings = new ArrayList<>();
		
		/**
		 * O erro cocorre porque uma lista é invariante
		 * List<Object> não é um super tipo de list List<?> é um super tipo de lista
		 * **/
		//myObjects = myStrings;
		
		/**
		 * assim funciona pois List<?>
		 * é o super tipo de list
		 * **/
		List<?> myObjects = new ArrayList<>();
		List<String> myStrings = new ArrayList<>();
		myObjects = myStrings;
	}

}
