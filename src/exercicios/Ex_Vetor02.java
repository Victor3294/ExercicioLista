package exercicios;

import java.util.Scanner;

public class Ex_Vetor02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];
		boolean checar = false;
		for(int i = 0; i < 10; i++){
			System.out.println("Digite o valor " + (i+1));
			vetor[i] = input.nextInt();
		}
		for(int i = 1; i < 10; i++) {
			if(vetor[i-1] > vetor[i]) {
				System.out.println("A lista não está em ordem crescente");
				System.exit(0);
			}
			else {
				checar =true;
				
			}
			
		}
		if(checar) {
			System.out.println("A lista está em ordem crescente");
		}
		input.close();
	}

}
