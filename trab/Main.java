package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Estudante> estudantes = new ArrayList<>();
		while (true) {
			System.out.println("\nOpções:");
			System.out.println("1. Adicionar Estudante");
			System.out.println("2. Remover Estudante");
			System.out.println("3. Buscar Estudante");
			System.out.println("4. Exibir todos os Estudantes");
			System.out.println("5. Sair"); 
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
				case 1 :

					adicionarEstudante(sc, estudantes);

				case 2 :

					removerEstudante(sc, estudantes);

				case 3 :

					buscarEstudante(sc, estudantes);

				case 4 : 

					exibirEstudantes(estudantes);

				case 5 : 

                    sc.close();
                    return;  

				default :

					System.out.println("Opção inválida."); 

			}
		} 
	}
	private static void adicionarEstudante(Scanner sc, ArrayList<Estudante> estudantes) {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Matrícula: ");
		String matricula = sc.nextLine();
		Estudante estudante = new Estudante(nome, idade, matricula);
		estudantes.add(estudante);
		System.out.println("Estudante adicionado com sucesso!"); 
	}
	private static void removerEstudante(Scanner sc, ArrayList<Estudante> estudantes) {
		System.out.print("Informe a matrícula do estudante a ser removido: ");
		String matricula = sc.nextLine(); boolean removido = false;
		for (Estudante estudante : estudantes) {
			if (estudante.getMatricula().equals(matricula)) {
				estudantes.remove(estudante); System.out.println("Estudante removido com sucesso!");
				removido = true;
				break; 
			} 
		} 
		if (!removido) {
			System.out.println("Estudante não encontrado."); 
		}
	} 
	private static void buscarEstudante(Scanner sc, ArrayList<Estudante> estudantes) {
		System.out.print("Informe a matrícula do estudante: "); 
		String matricula = sc.nextLine();
		for (Estudante estudante : estudantes) { 
			if (estudante.getMatricula().equals(matricula)) {
				estudante.mostrarDados(); 
				return; 
			} 
		} 
		System.out.println("Estudante não encontrado."); 
	} 
	private static void exibirEstudantes(ArrayList<Estudante> estudantes) { 
		if (estudantes.isEmpty()) {
			System.out.println("Nenhum estudante cadastrado."); 
		} else {
			for (Estudante estudante : estudantes) { 
				estudante.mostrarDados(); 
			} 
		}
	}
}
