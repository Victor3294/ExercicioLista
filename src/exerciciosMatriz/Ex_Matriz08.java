package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.println("Digite o valor de colunas da matriz: ");
		int colunas = sc.nextInt();
		int[][] matriz = new int[linhas][colunas]; 
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i +"][" +j+"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite algum valor da matriz informada anteriormente: ");
		int valorX = sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == valorX) {
					System.out.println("Posição " + i+ "," + j+ ":");
					if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[0].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    System.out.println();
				}
			}
		}
		sc.close();
	}

}
