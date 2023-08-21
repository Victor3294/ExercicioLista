package exercicios;
import java.util.Scanner;
public class Ex_Vetor06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite quantas pessoas serão registradas: ");
		int n = input.nextInt();
		String[] nomes = new String[n];
		int[] idade = new int[n];
		int maior = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o nome da pessoa " + (i+1));
			nomes[i] = input.next();
			System.out.println("Digite a idade da pessoa " + (i+1));
			idade[i] = input.nextInt();
			if(i == 0) {
				maior = idade[i];
			}
			else if( maior < idade[i]) {
				maior = idade[i];
			}
		}
		System.out.println("A(s) pessoa(s) mais velha(s) é/são: ");
		for(int i = 0; i < n; i++) {
			if (idade[i] == maior) {
				System.out.println(nomes[i] + " com " + maior + " ano(s)");
			}
		}
		input.close();

	}

}
