package POO2Exercicio05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	List<Livro> livros = new ArrayList<>();
	
	public void addLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	
	public String emprestimo(String livro, String cliente, LocalDate data) {
		for(Livro l : livros) {
			if(l.getNome().equalsIgnoreCase(livro)) {
				l.setDisponibilidade("Emprestado");
				return "O livro " + livro + " foi emprestado ao cliente " + cliente + " na data: " + dtf.format(data);
			}
		}
		return "O livro não está presente na biblioteca.";
	}
	
	public String devolucao(String livro, String cliente, LocalDate data) {
		for(Livro l : livros) {
			if(l.getNome().equalsIgnoreCase(livro)) {
				l.setDisponibilidade("Disponivel");
				return "O livro " + livro + " foi devolvido pelo cliente " + cliente + " na data: " + dtf.format(data);
			}
		}
		return "Este livro nunca esteve presente na biblioteca.";
	}
	
	public String listar(String opcao, String tipoOpcao){
		StringBuilder sb = new StringBuilder();
		
		if(opcao.equalsIgnoreCase("titulo")) {
			System.out.println("Livro(s) com o título desejado: ");
			for(Livro l : livros) {
				if(l.getNome().contains(tipoOpcao)) {
					sb.append(l.getNome() + "\n");
				}
			}
		} else if (opcao.equalsIgnoreCase("autor")) {
			System.out.println("Livro(s) com o autor desejado: ");
			for(Livro l : livros) {
				if(l.getAutor().contains(tipoOpcao)) {
					sb.append(l.getNome() + "\n");
				}
			}
		} else {
			System.out.println("Livro(s) com o gênero desejado: ");
			for(Livro l : livros) {
				if(l.getGenero().contains(tipoOpcao)) {
					sb.append(l.getNome() + "\n");
				}
			}
		}
		return sb.toString();
	}
	
	public String reservar(String livro) {
		return "O " + livro + " foi reservado e você será o próximo a obte-lo.";
	}
	
	public String extenderEmprestimo(LocalDate inicio, LocalDate dataFinal) {
		for(Livro l : livros) {
			if(!(l.getDisponibilidade().equalsIgnoreCase("reservado")) && !(l.getDisponibilidade().equalsIgnoreCase("disponivel")) ) {
				return "O livro que teve o inicio do seu empréstimo na data " + dtf.format(inicio) + " foi extendido e agora será entregue em: " + dtf.format(dataFinal);

			}
		}
		return "Não há livros emprestados.";
	}
	
	public String multa(LocalDate dataFinal, LocalDate dataEntregue) {
		Duration duration = Duration.between(dataFinal.atStartOfDay(), dataEntregue.atStartOfDay());
		long dias = duration.toDays();
		double valor = 15 * dias;
		return "Como o valor por dia de multa é de R$15,00 e você passou " + dias + " da data final " + dtf.format(dataFinal) + "...\n"
				+ "Terá que pagar: R$" + String.format("%.2f", valor) + " reais.";
		
	}
		
}
