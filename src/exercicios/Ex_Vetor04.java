package exercicios;
import java.util.Scanner;
public class Ex_Vetor04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros a serem registrados: ");
		int n = input.nextInt();
		int somatorio = 0;
		int[] vetor = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("digite o numero da posição " + (i+1));
			vetor[i] = input.nextInt();
			if(vetor[i] %2 == 0) {
				somatorio+= 1;
			}
		}
		System.out.println("Foi digitado " + somatorio + " números pares");
		System.out.println("E eles são: ");
		for(int i = 0; i < n ; i++) {
			if(vetor[i] %2 == 0) {
				System.out.println(vetor[i]);
			}
		}
		input.close();

	}

}
