package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz04 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int[][] matrizT = new int[4][4];
		Random obj = new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				matriz[i][j] = obj.nextInt(10);
			}
		}
		for(int i = 0; i < matrizT.length; i++) {
			for(int j = 0; j< matrizT[0].length; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				System.out.print(matrizT[i][j] + " ");
			}
			System.out.println();
		}
	}

}
