package exerciciosMatriz;

import java.util.*;

public class Ex_Matriz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int colunas1, linhas1, colunas2, linhas2;
		while (true) {
			System.out.println("Digite o valor de linhas da primeira matriz: ");
			linhas1 = sc.nextInt();
			System.out.println("Digite o valor de colunas da primeira matriz: ");
			colunas1 = sc.nextInt();
			System.out.println("Digite o valor de linhas da segunda matriz: ");
			linhas2 = sc.nextInt();
			System.out.println("Digite o valor de colunas da segundas matriz: ");
			colunas2 = sc.nextInt();
			if (colunas1 == linhas2) {
				break;
			}
		}
		double[][] matriz1 = new double[linhas1][colunas1];
		double[][] matriz2 = new double[linhas2][colunas2];
		double[][] resultado = new double[linhas1][colunas2];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i + "]" + "[" + j + "] da matriz 1: ");
				matriz1[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i + "]" + "[" + j + "] da matriz 2: ");
				matriz2[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				for (int k = 0; k < matriz1[0].length; k++) {
					resultado[i][j] = matriz1[i][k] * matriz2[k][j];
				}
			}
		}
		System.out.println("A multiplicação das matrizes digitadas é: ");
		for(int i = 0; i< matriz1.length; i++) {
			for(int j = 0; j< matriz1[0].length; j++) {
				System.out.print(resultado[i][j] + " ") ;
			}
			System.out.println();
		}
		sc.close();

	}

}
