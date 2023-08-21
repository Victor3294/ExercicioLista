package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int maior = 0;
		int posicaox = 0, posicaoy = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i +"][" +j+"]: ");
				matriz[i][j] = sc.nextInt();
				if(j == 0 && i == 0) {
					maior = matriz[i][j];
				}
				else if(maior < matriz[i][j]) {
					maior = matriz[i][j];
					posicaox = i;
					posicaoy = j;
				}
			}
		}
		System.out.println("O maior valor da matriz é: " + maior);
		System.out.println("E sua posição é ["+posicaox+"][" +posicaoy+"]");
		sc.close();

	}

}
