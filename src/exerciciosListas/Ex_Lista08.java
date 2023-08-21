package exerciciosListas;
import java.util.*;
public class Ex_Lista08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random nR = new Random();
		int numeroSorteado = nR.nextInt(200);
		int chute = 0;
		int tentativas = 0;
		while(true) {
			System.out.println("Tente adivinhar o número sorteado (1 a 200): ");
			chute = sc.nextInt();
			tentativas ++;
			if(chute < numeroSorteado) {
				System.out.println("Palpite muito baixo, tente novamente.");
			}
			else if(chute > numeroSorteado) {
				System.out.println("Palpite muito alto, tente novamente.");
			}
			else {
				System.out.println("Parabéns você acertou o número sorteado em " + tentativas + " tentativas.");
				break;
			}
		}
		sc.close();

	}

}
