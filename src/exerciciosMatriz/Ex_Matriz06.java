package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		double soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i +"][" +j+"]: ");
				matriz[i][j] = sc.nextDouble();
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			soma += matriz[i][i];
		}
		System.out.println("A soma dos valores da diagonal principal é: " + soma);
		sc.close();
	}	

}
