package exerciciosListas;
import java.util.*;
public class Ex_Lista04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vão ter a lista: ");
		int n = sc.nextInt();
		List<Integer> lista = new ArrayList<>();
		List<Integer> listaPar = new ArrayList<>();
		List<Integer> listaImpar = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o valor da posição " + (i+1) +" da lista: ");
			int nAdd = sc.nextInt();
			lista.add(nAdd);
			if(nAdd % 2 == 0) {
				listaPar.add(nAdd);
			}
			else if (nAdd % 2 != 0) {
				listaImpar.add(nAdd);
			}
			
		}
		
		for(int nL: lista) {
			System.out.print(nL + " ");
		}
		System.out.println();
		for(int nL: listaPar) {
			System.out.print(nL + " ");
		}
		System.out.println();
		for(int nL: listaImpar) {
			System.out.print(nL + " ");
		}
		sc.close();

	}

}
