package generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new NullPointerException("Lista esta vazia");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		for(T number : list) { 
			System.out.print(number+",");
		}
		System.out.println("]");
	}
}
