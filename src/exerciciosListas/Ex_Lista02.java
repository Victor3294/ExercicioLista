package exerciciosListas;

import java.util.ArrayList;
import java.util.List;

public class Ex_Lista02 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		int soma = 0;
		for(int n :lista){
			soma += n;
		}
		double media = (double) soma/lista.size();
		System.out.println(media);
	}

}
