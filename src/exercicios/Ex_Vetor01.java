package exercicios;

import java.util.Scanner;

public class Ex_Vetor01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o valor " + (i+1));
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}
		System.out.println(soma);
		input.close();
		

	}

}
