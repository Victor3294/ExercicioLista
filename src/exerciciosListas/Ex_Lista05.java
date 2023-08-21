package exerciciosListas;

import java.util.*;

public class Ex_Lista05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão cadastradas ? ");
		int n = sc.nextInt();
		List<Integer> id = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		List<Double> salario = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			while(true) {
				System.out.println("Funcionario #" + (i+1));
				System.out.println("Id: ");
				int idF = sc.nextInt();
				if(i == 0) {
					id.add(idF);
					break;
				}
				else if(id.contains(idF)) {
					System.out.println("Digite um id valido!");
				}
				else {
					id.add(idF);
					break;
				}
			}
			System.out.println("Nome: ");
			nomes.add(sc.next());
			System.out.println("Salario: ");
			salario.add(sc.nextDouble());
		}
		System.out.println("Digite o id do funcionário que recebera um aumento: ");
		int idX = sc.nextInt();
		if(id.contains(idX)) {
			System.out.println("Digite a porcentagem que será aumentada: ");
			int porc = sc.nextInt();
			int posi = id.indexOf(idX);
			double nSalario = ((salario.get(posi) * porc) /100 )+salario.get(posi);
			salario.remove(posi);
			salario.add(posi, nSalario);
			
		}
		else {
			System.out.println("Id informado inexistente, operação abortada!");
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.println(id.get(i) + ", " + nomes.get(i) + ", " + salario.get(i));
		}
		sc.close();

	}

}
