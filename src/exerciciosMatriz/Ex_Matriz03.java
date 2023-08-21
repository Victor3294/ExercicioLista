package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.println("Informe a quantidade de colunas da matriz: ");
		int colunas = sc.nextInt();
		double[][] matriz = new double[linhas][colunas];
		double[][] matrizT = new double[colunas][linhas];
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i + "]" + "[" +j+ "] da matriz 1: " );
				matriz[i][j] = sc.nextDouble();
			}
		}
		for(int i = 0;i < matrizT.length; i++) {
			for(int j = 0; j < matrizT[0].length; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}
		for(int i = 0; i< matrizT.length; i++) {
			for(int j = 0; j< matrizT[0].length; j++) {
				System.out.print(matrizT[i][j] + " ") ;
			}
			System.out.println();
		}
		sc.close();
	}

}
