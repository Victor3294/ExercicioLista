package aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		
		
		/*Random random = new Random();
		int[] numeros = {1,2,3,4,5,6};
		double [] valores;
		valores = new double[5];
		valores[0] = 5.0;
		
		int[] numeros2 = new int[5];
		for(int i = 0; i< numeros2.length; i++) {
			numeros2[i] = random.nextInt(10);
			System.out.println(numeros2[i]);
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
		System.out.println(Arrays.toString(copiaNumeros));
		
		int[] numeros2 = new int[5];
		Arrays.fill(numeros2, 5);
		System.out.println(Arrays.toString(numeros2));
		
		int[] numeros3 = {3,2,6,1,9};
		Arrays.sort(numeros3);
		System.out.println(Arrays.toString(numeros3));
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas pessoas serão cadastradas: ");
		int nPessoas = input.nextInt();
		double[] alturas = new double[nPessoas];
		double soma = 0;
		for(int i = 0; i < nPessoas; i++) {
			System.out.println("Digite a altura (cm) da pessoa " + (i+1));
			alturas[i] = input.nextDouble();
			soma += alturas[i];
		}
		double media = (double) soma/alturas.length;
		System.out.println(media);
		input.close();
		
		int [] [] matriz = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		int [] [] matriz2 = new int [3][3];
		matriz2[1][2] = 5;
		
		for (int i = 0; i< matriz2.length; i++) {
			System.out.println(Arrays.toString(null));
		
		Scanner input = Scanner(System.in);
		System.out.println("Digite a ordem da matriz ");
		int n = input.nextInt();
		int [] [] matriz = new int [n][n];
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j< matriz[0].length; j++) {
				System.out.println("Digite o valor da linha " + (i + 1) + "e coluna " + ( j + 1));
				matriz[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i< matriz.length ; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		List<String> lista = new ArrayList<>();
		
		lista.add("João");
		lista.add("Fabão");
		lista.add("Marião");
		
		System.out.println(lista);
		for(String list : lista) {
			System.out.println(list);
		}
		System.out.println(lista.size());
		lista.remove("Marião");
		System.out.println(lista);
		System.out.println(lista.size());
		lista.add("Marião");
		System.out.println(lista.get(1));
		
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(2);
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);
		lista2.add(6);
		lista2.add(7);
		
		System.out.println(lista2);
		lista2.remove(4);
		System.out.println(lista2);
		lista2.remove(Integer.valueOf(4));
		System.out.println(lista2);
		
		lista.removeIf(i -> i.charAt(0) == 'M');
		System.out.println(lista);
		
		lista2.removeIf(i -> i > 4);
		System.out.println(lista2);
		
		lista2.add(1, 55);
		System.out.println(lista2);
		
		lista2.clear();
		System.out.println(lista2);
		
		boolean vazia = lista2.isEmpty();
		System.out.println(vazia);
		
		
		
		
		lista2.add(33);
		lista2.add(44);
		lista2.add(55);
		lista2.add(66);
		lista2.add(77);
		System.out.println(lista2);
		
		int ultimo = lista2.get(lista2.size());
		System.out.println(ultimo);*/
		
		Scanner input = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		while(true) {
			System.out.println("Menu");
			System.out.println("1 - Adicionar item");
			System.out.println("2 - Remover item");
			System.out.println("3 - Exibir lista");
			System.out.println("4 - Sair do programa");
			System.out.println("Escolha uma opção: ");
			int escolha = input.nextInt();
			input.nextLine();
			
			switch(escolha) {
				case 1:
					System.out.println("Digite o nome do item: ");
					String item = input.nextLine();
					lista.add(item);
					System.out.println("Item adicionado");
					break;
				case 2:
					System.out.println("Itens da lista ");
					for(int i = 0; i< lista.size(); i++) {
						System.out.println("Item " + i + " " + lista.get(i));
					}
					System.out.println("Digite o item a ser removido: ");
					int itemRemover = input.nextInt();
					if(itemRemover < lista.size()) {
						lista.remove(itemRemover);
						System.out.println("Item removido com sucesso");
					}
					else {
						System.out.println("Item não exite");
					}
					break;
				case 3:
					for(int i = 0; i< lista.size(); i++) {
						System.out.println("Item " + i + " " + lista.get(i));
					}
					break;
				case 4:
					System.out.println("Saindo do programa ...");
					
			}
		}
		
		}

	}

