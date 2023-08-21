package exerciciosListas;

import java.util.*;

public class Ex_Lista07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		int op = 0;
		do {
			System.out.println("Sistema de armazenamento de biblioteca: ");
			System.out.println("1- Adicionar Livros: ");
			System.out.println("2- Buscar Livros: ");
			System.out.println("3- Exibir Tarefas: ");
			System.out.println("4- Sair do sistema: ");
			System.out.println("Escolha uma das opções: ");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Digite o nome do livro a ser adicionada: ");
				String item = sc.next();
				lista.add(item);
				sc.nextLine();
				break;
			case 2:
				System.out.println("Digite o título do livro a ser procurado:  ");
				String itemBusca = sc.next();
				for(String l: lista) {
					if(l.equalsIgnoreCase(itemBusca)) {
						System.out.println("O item " + itemBusca + " foi encontrado nos registros na posição: " + lista.indexOf(l));
						break;
					}
				}
				sc.nextLine();
			case 3:
				if (!lista.isEmpty()) {
					System.out.println("lista de livros registrados!");
					for (int i = 0; i < lista.size(); i++) {
						System.out.println(i + "- " + lista.get(i));
					}
				}

				else {
					System.out.println("Impossivel exibir uma lista vazia! ");
					break;
				}
				break;
			case 4:
				
				break;
			default:
				System.out.println("Opção invalida!");
			}
		} while (op != 4);
		System.out.println("Saindo do programa!");
		sc.close();
	}

}
