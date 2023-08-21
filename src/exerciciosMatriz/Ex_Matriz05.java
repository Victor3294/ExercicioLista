package exerciciosMatriz;
import java.util.*;
public class Ex_Matriz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		int cont = 0;
		double somatorio = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite o elemento da posição [" + i +"][" +j+"]: ");
				matriz[i][j] = sc.nextDouble();
				if((i+j) % 2 == 0) {
					cont+=1;
					somatorio+=matriz[i][j];
				}
			}
		}
		double media = somatorio/ cont;
		System.out.println("A medias dos valores nas posições pares é: " + media);
		sc.close();
	}

}
