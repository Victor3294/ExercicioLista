package exercicios;
import java.util.Scanner;
public class Ex_Vetor03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas pessoas serão registradas ? ");
		int nPessoas = input.nextInt();
		String[] nome = new String[nPessoas];
		int[] idade = new int[nPessoas];
		double[] altura = new double[nPessoas];
		double somatorio = 0;
		int somatorioIdade = 0;
		for(int i = 0; i < nPessoas; i++) {
			System.out.println("Digite o nome da pessoa " + (i+1));
			nome[i] = input.next();
			System.out.println("Digite a idade da pessoa " + (i+1));
			idade[i] = input.nextInt();
			if(idade[i] < 16) {
				somatorioIdade += 1;
			}
			System.out.println("Digite a altura da pessoa " + (i+1));
			altura[i] = input.nextDouble();
			somatorio += altura[i];
		}
		double mediaAltura = somatorio/nPessoas;
		System.out.printf("A altura media das pessoas informadas é %.2f \n", mediaAltura);
		if(somatorioIdade != 0) {
			int porcentagem = (somatorioIdade*100)/nPessoas;
			System.out.println("A procentagem de pessoas registradas com menos de 16 anos é " + porcentagem + "%");
		}
		System.out.println("E seus respectivos nomes são: ");
		for(int i = 0; i < nPessoas; i++) {
			if(idade[i]< 16){			
				System.out.println(nome[i]);
			
			}
		}
		input.close();

	}

}
