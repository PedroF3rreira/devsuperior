package generics.services;


import java.util.List;

public class CalculateService {

	/**
	 * para parametrizaer como generic apenas o método devemos colocar 
	 * o <T> depois T indicando que esse método retorna um generic
	 * */
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		T max = list.get(0);
		
		for (T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
	}
}
