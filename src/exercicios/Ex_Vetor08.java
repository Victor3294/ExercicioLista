package exercicios;
import java.util.*;
public class Ex_Vetor08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas pessoas serão registradas: ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		double somaAlturas = 0;
		int contaIdade = 0;
		String[] nomes16 = new String[n]; 
		for (int i = 0 ; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.println("Nome: ");
			nomes[i] = sc.next();
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			if(idades[i] < 16) {
				contaIdade +=1;
				nomes16[i] = nomes[i];
			}
			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
			somaAlturas += alturas[i];
		}
		double mediaAltura = somaAlturas/n;
		System.out.println("A altura media: " + mediaAltura);
		if(contaIdade > 0) {
			double porcentagemIdade = (contaIdade*100)/n;
			System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemIdade + "%");
			System.out.println("E as pessoas que fazem parte desssa estátistica são: ");
			for(String nome: nomes16) {
				if(nome != null) {
					System.out.println(nome);
				}
				
			}
		}
		else {
			System.out.println("Porcentagem de pessoas com menos de 16 anos: " + 0 + "%");
		}
		sc.close();
	}

}
