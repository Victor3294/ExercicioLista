package exerciciosListas;

import java.util.*;

public class Ex_Lista06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listaTarefas = new ArrayList<>();
		List<String> listaTarefasConcluidas = new ArrayList<>();
		int op =0;
		do{
			System.out.println("Programa de lista de tarefas: ");
			System.out.println("1- Adicionar Tarefas: ");
			System.out.println("2- Remover Tarefas: ");
			System.out.println("3- Exibir Tarefas: ");
			System.out.println("4- Marcar Tarefas como concluidas: ");
			System.out.println("5- Sair do Programa: ");
			System.out.println("Escolha uma das opções: ");
			
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Digite o nome da tarefa a ser adicionada: ");
				String item = sc.next();
				listaTarefas.add(item);
				sc.nextLine();
				break;
			case 2:
				if (!listaTarefas.isEmpty()) {
					for (int i = 0; i < listaTarefas.size(); i++) {
						System.out.println(i + "- " + listaTarefas.get(i));
					}
					while (true) {
						System.out.println("Digite a posição da tarefa a ser removida: ");
						int opRemove = sc.nextInt();
						if ((opRemove < 0) || (opRemove >= listaTarefas.size())) {
							System.out.println("Opção Invalida");
						} else {
							listaTarefas.remove(opRemove);
							System.out.println("Tarefa removida da lista com sucesso !");
							break;
						}
					}
					break;
				} else {
					System.out.println("Impossivel remover tarefas de uma lista vazia!");
					break;
				}
			case 3:
				if (!listaTarefas.isEmpty()) {
					System.out.println("lista de tarefas há fazer");
					for (int i = 0; i < listaTarefas.size(); i++) {
						System.out.println(i + "- " + listaTarefas.get(i));
					}
					
				}if (!listaTarefasConcluidas.isEmpty()) {
					System.out.println("Lista de tarefas concluidas");
					for (int i = 0; i < listaTarefasConcluidas.size(); i++) {
						System.out.println(i + "- " + listaTarefasConcluidas.get(i));
					}
					
				}

				else {
					System.out.println("Impossivel exibir uma lista vazia! ");
					break;
				}
				break;
			case 4:
				if (!listaTarefas.isEmpty()) {
					for (int i = 0; i < listaTarefas.size(); i++) {
						System.out.println(i + "- " + listaTarefas.get(i));
					}
					while (true) {
						System.out.println("Digite a posição da tarefa a ser marcada como concluida: ");
						int opConclui = sc.nextInt();
						if ((opConclui < 0) || (opConclui >= listaTarefas.size())) {
							System.out.println("Opção Invalida");
						} else {
							
							String concluida = listaTarefas.get(opConclui);
							listaTarefasConcluidas.add(concluida);
							listaTarefas.remove(opConclui);
							System.out.println("Tarefa marcada como concluida com sucesso !");
							break;
						}
					}
				} else {
					System.out.println("Impossivel concluir tarefas de uma lista vazia! ");
					break;
				}
			case 5:				
				break;
			default:
				System.out.println("opção invalida");
				break;
			}

		}while(op!=5);
		System.out.println("Saindo do programa! ");
		sc.close();
	}

}
