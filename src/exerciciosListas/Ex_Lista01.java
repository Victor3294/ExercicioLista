package exerciciosListas;
import java.util.*;
public class Ex_Lista01 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		int maiorValor = lista.get(0);
		for(int numero: lista) {
			if(numero > maiorValor){
				maiorValor = numero;
			}
		}
		for(int n: lista) {
			System.out.print(n + " ");
		}
		lista.remove(Integer.valueOf(maiorValor));
		System.out.println();
		for(int n:lista) {
			System.out.print(n + " ");
		}
	}

}
