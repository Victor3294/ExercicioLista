package exerciciosListas;

import java.util.ArrayList;
import java.util.List;

public class Ex_Lista03 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		System.out.println("A lista contem o valor 19 ? " + lista.contains(19));
		System.out.println("A lista contem o valor 19 ? " + lista.contains(25));

	}

}
