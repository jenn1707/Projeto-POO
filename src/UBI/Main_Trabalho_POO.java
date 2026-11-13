package UBI;

import java.time.LocalDate;

public class Main_Trabalho_POO {
	public static void main(String[] args) {
		// G10
		//Jennifer Calvopina 55462
		//Nicolas Laurindo 55636
		//Filipe Pedro 55870
		//Rodrigo Freire 56287
		
		LocalDate dataEstreia = LocalDate.of(1992, 11, 20);
		
		Construtor_Trabalho_POO filme1 = new Construtor_Trabalho_POO();
		filme1.setTitulo("Home Alone 2");
		filme1.setsubTitulo("Lost in New York");
		filme1.setData(dataEstreia);
		filme1.setIdademin(10);
		filme1.setAvaliacao(6.8);
		filme1.setDuracao(120.0);
		
		String[] listaDiretores = {"Chris Colummbus"};
		String[] listaEscritores = {"Jonh Hughes"};
		String[] listaEstrelas = {"Macaulay Culkin", "Joe Pesci", "Daniel Stern"};
		String [] listaGeneros = {"Comédia", "Familiar", "Aventura"};
		
		filme1.setDiretor(listaDiretores);
		filme1.setEscritor(listaEscritores);
		filme1.setEstrelas(listaEstrelas);
		filme1.setGenero(listaGeneros);
		
		System.out.println("--- DADOS DO FILME ---");
		System.out.println("Filme: " + filme1.getTitulo() + " - " +filme1.getsubTitulo());
		System.out.println("Estreia: " + filme1.getData());
		System.out.println("Duração: " + filme1.getDuracao() + " min | Idade: +" +filme1.getIdademin());
		System.out.println("Avaliação: " + filme1.getAvaliacao() + "/10");
		System.out.println("Diretor: "+ filme1.getDiretor()[0]);
		System.out.println("Escritor: "+ filme1.getEscritor()[0]);
		System.out.println("Estrela principal: " + filme1.getEstrelas()[0]);
		System.out.println("Género: " + filme1.getGenero()[0] + ", " + filme1.getGenero()[1] + ", " + filme1.getGenero()[2]);
	}
}
