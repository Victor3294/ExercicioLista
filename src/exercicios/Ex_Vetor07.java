package exercicios;

import java.util.*;

public class Ex_Vetor07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[10];
		String[] emails = new String[10];

		System.out.print("Digite o número de estudantes (1 a 10): ");
		int n = scanner.nextInt();
		
		

		int[] quartos = new int[10];

		System.out.println("\nRegistre o aluguel dos quartos:");
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do estudante " + (i + 1) + ": ");
			nomes[i] = scanner.next();
			System.out.println("Digite o email: ");
			emails[i] = scanner.next();

			int quartoEscolhido;
			do {
				System.out.print(nomes[i] + ", escolha um quarto (0 a 9): ");
				quartoEscolhido = scanner.nextInt();
			} while (quartoEscolhido < 0 || quartoEscolhido > 9 || quartos[quartoEscolhido] != 0);

			quartos[quartoEscolhido] = i + 1;
		}

		System.out.println("\nRelatório de ocupações do pensionato:");
		for (int i = 0; i < 10; i++) {
			if (quartos[i] != 0) {
				System.out.println("Quarto " + i + ": Estudante " + nomes[quartos[i] - 1] + " Email: " + emails[quartos[i] - 1]);
			} 
		}
		scanner.close();

	}

}
