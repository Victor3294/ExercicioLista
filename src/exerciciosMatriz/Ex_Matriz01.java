package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas das matrizes: ");
		int linhas = sc.nextInt();
		System.out.println("Digite a quantidade de colunas das matrizes: ");
		int colunas = sc.nextInt();
		double[][] matriz1 = new double[linhas][colunas];
		double[][] matriz2 = new double[linhas][colunas];
		double[][] resultado = new double[linhas][colunas];
		
		for(int i = 0; i< matriz1.length; i++) {
			for(int j = 0; j< matriz1[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i + "]" + "[" +j+ "] da matriz 1: " );
				matriz1[i][j] = sc.nextDouble();
			}
		}
		for(int i = 0; i< matriz2.length; i++) {
			for(int j = 0; j< matriz2[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i + "]" + "[" +j+ "] da matriz 2: " );
				matriz2[i][j] = sc.nextDouble();
			}
		}
		for(int i = 0; i< matriz1.length; i++) {
			for(int j = 0; j< matriz1[0].length; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("A soma das matrizes digitadas é: ");
		for(int i = 0; i< matriz1.length; i++) {
			for(int j = 0; j< matriz1[0].length; j++) {
				System.out.print(resultado[i][j] + " ") ;
			}
			System.out.println();
		}
		sc.close();
		
	}

}
