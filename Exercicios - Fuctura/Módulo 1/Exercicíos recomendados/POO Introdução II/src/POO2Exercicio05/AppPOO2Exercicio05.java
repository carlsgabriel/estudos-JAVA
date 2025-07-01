package POO2Exercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppPOO2Exercicio05 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		
		Biblioteca biblioteca = new Biblioteca();
		
		
		System.out.println("Adicionar livros a biblioteca:");
		
		boolean continuar = true;
		do{
			System.out.print("Nome do livro: ");
			String nome = scan.nextLine();
			
			System.out.print("Nome do autor: ");
			String nomeAutor = scan.nextLine();
			
			System.out.print("Gênero: ");
			String genero = scan.nextLine();
			
			System.out.print("Nome da editora: ");
			String nomeEditora = scan.nextLine();
			
			System.out.print("Ano de publicação do livro: ");
			int anoPublicacao = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Disponibilidade [Disponivel, emprestado ou reservado]: ");
			String disponibilidade = scan.nextLine();
			
			Livro livro = new Livro();
			livro.setNome(nome);
			livro.setAutor(nomeAutor);
			livro.setGenero(genero);
			livro.setEditora(nomeEditora);
			livro.setAnoDePublicacao(anoPublicacao);
			livro.setDisponibilidade(disponibilidade);
			
			biblioteca.addLivro(livro);
			
			System.out.println("\nDeseja continuar adicionando livros? ");
			System.out.print("\"sim\" ou \"nao\": ");
			String op = scan.nextLine();
			
			System.out.println();
			
			if(op.equalsIgnoreCase("Sim") || op.equalsIgnoreCase("s")) {
				continuar = true;
			} else {
				continuar = false;
			}
			
		} while (continuar != false);
		
		System.out.println();
		
		boolean prosseguir = true;
		while(prosseguir != false) {
		
		System.out.println("Todos os livros na biblioteca atualmente: ");
		for(Livro l : biblioteca.livros) {
			if(l.getDisponibilidade().equalsIgnoreCase("Disponivel")) {
				System.out.println("Nome: " + l.getNome());
				System.out.println("Autor: " + l.getAutor());
				System.out.println("Genero: " + l.getGenero());
				System.out.println("Editora: " + l.getEditora());
				System.out.println("Ano de publicação: " + l.getAnoDePublicacao());
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println("MENU");
		String menu = """
				1. EMPRESTIMO
				2. DEVOLUÇÃO
				3. PESQUISAR POR TÍTULO/AUTOR/GÊNERO
				4. RESERVAR LIVRO
				5. RENOVAR EMPRÉSTIMO
				6. MULTAR POR ATRASO
				7. SAIR DO MENU
				Opção desejada: 
				""";
		System.out.print(menu);
		int opInt = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
			
			switch(opInt) {
			case 1 -> { 
				System.out.print("Nome do cliente que pegará o livro emprestado: ");
				String nome = scan.nextLine();
				System.out.print("Livro: ");
				String nomeLivro = scan.nextLine();
				
				System.out.println();
				
				System.out.println(biblioteca.emprestimo(nomeLivro, nome, LocalDate.now()));
				
			}
			case 2 -> {
				System.out.print("Nome do cliente que devolverá o livro: ");
				String nome = scan.nextLine();
				System.out.print("Livro a ser devolvido: ");
				String nomeLivro = scan.nextLine();
				System.out.println("Registre abaixo a data de devolução, seguindo este exemplo dia/mes/ano. ");
				System.out.print("Data de devolução: ");
				String data = scan.nextLine();
				LocalDate dataDevolucao = LocalDate.parse(data, dtf);
				
				System.out.println();
				
				System.out.println(biblioteca.devolucao(nomeLivro, nome, dataDevolucao));	
			}
			case 3 -> {
				System.out.print("Você quer pesquisar por titulo, autor ou gênero: ");
				String opcao = scan.nextLine();
				if(opcao.equalsIgnoreCase("titulo")) {
					System.out.print("Insira o titulo que você deseja procurar: ");
					String opcao2 = scan.nextLine();
					
					System.out.println();
					
					System.out.println(biblioteca.listar(opcao, opcao2));
				} else if (opcao.equalsIgnoreCase("autor")) {
					System.out.print("Insira o autor que você deseja procurar: ");
					String opcao2 = scan.nextLine();
					
					System.out.println();
					
					System.out.println(biblioteca.listar(opcao, opcao2));
				} else {
					System.out.print("Insira o gênero que você deseja procurar: ");
					String opcao2 = scan.nextLine();
					
					System.out.println();
					
					System.out.println(biblioteca.listar(opcao, opcao2));
				}
				
			}
			case 4 -> {
				int count = 0;
				for(Livro l : biblioteca.livros) {
					if(l.getDisponibilidade().equalsIgnoreCase("emprestado")) {
						count++;
					}
				}
				
				System.out.println("Livros que estão emprestados atualmente: ");
				
				if(count > 0) {
					for(Livro l : biblioteca.livros) {
						if(l.getDisponibilidade().equalsIgnoreCase("emprestado")) {
							System.out.println(l.getNome());
							
							System.out.println();
							
							System.out.print("Deseja reservar que livro? ");
							String livroReservado = scan.nextLine();
							
							System.out.println(biblioteca.reservar(livroReservado));
						} 
					}
				} else {
					System.out.println("Não há livros emprestados no momento.");
				}
				
					
			}
			case 5 -> {
				int count = 0;
				
				for(Livro l : biblioteca.livros) {
					if(l.getDisponibilidade().equalsIgnoreCase("empretado")){
						count++;
					}
				}
				
				if(count > 0) {
					for(Livro l : biblioteca.livros) {
						if(l.getDisponibilidade().equalsIgnoreCase("emprestado")) {
							System.out.print("Data inicial do empréstimo [dia/mes/ano]:");
							String dataI = scan.nextLine();
							LocalDate dataInicio = LocalDate.parse(dataI, dtf); 
							
							System.out.print("Data final do empréstimo [dia/mes/ano]:");
							String dataF = scan.nextLine();
							LocalDate dataFinal = LocalDate.parse(dataF, dtf);
							
							System.out.println(biblioteca.extenderEmprestimo(dataInicio, dataFinal));
						}
					}
				} else {
					System.out.println("Não há livros emprestados no momento, então não tem como extender o prazo do empréstimo.");
				}
				
				
			}
			case 6 -> {
				System.out.print("Data final do empréstimo [dia/mes/ano]:");
				String dataF = scan.nextLine();
				LocalDate dataFinal = LocalDate.parse(dataF, dtf);
				
				System.out.print("Quando você entregou [dia/mes/ano]: ");
				String dataE = scan.nextLine();
				LocalDate dataEntregue = LocalDate.parse(dataE, dtf);
				
				System.out.println(biblioteca.multa(dataFinal, dataEntregue));
			}
			case 7 -> {
				System.out.println("Saindo do menu...");
				return;
				
			}
			default -> System.out.println("Valor inválido.");
			}
			
			System.out.println();
			
			System.out.println("Deseja continuar no programa");
			System.out.print("Sim ou nao: ");
			String simOuNao = scan.nextLine();
			
			System.out.println();
			
			if(simOuNao.equalsIgnoreCase("sim")) {
				prosseguir = true;
			}
		}
		
		scan.close();
		
	}

}
