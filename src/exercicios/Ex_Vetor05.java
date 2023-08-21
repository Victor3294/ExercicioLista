package exercicios;
import java.util.Scanner;
public class Ex_Vetor05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite quantos números serão informados: ");
		int n = input.nextInt();
		double[] vetor = new double[n];
		double somatorio = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o número da posição " + (i+1));
			vetor[i] = input.nextDouble();
			somatorio += vetor[i];
		}
		double media = somatorio/n;
		System.out.printf("A media dos valores informados é %.3f\n", media);
		System.out.println("E dentre os valores informados, os menores que a media são: ");
		for(double v: vetor) {
			if(v < media) {
				System.out.println(v);
			}
		}
		input.close();

	}

}
