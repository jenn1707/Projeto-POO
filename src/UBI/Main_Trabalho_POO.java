package UBI;

import java.time.LocalDate;

public class Main_Trabalho_POO {
	public static void main(String[] args) {
		// G10
		//Jennifer Calvopina 55462
		//Nicolas Laurindo 55636
		//Filipe Pedro 55870
		//Rodrigo Freire 56287
		
		
		
		
		Construtor_Trabalho_POO filme1 = new Construtor_Trabalho_POO();
		LocalDate dataEstreia = LocalDate.of(1992, 11, 20);
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
		System.out.println(filme1.toString());
		
		
		
		
		Construtor_Trabalho_POO filme2 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2018, 12, 13);
		filme2.setTitulo("Homen-Aranha");
		filme2.setsubTitulo("No Universo Aranha");
		filme2.setData(dataEstreia);
		filme2.setIdademin(6);
		filme2.setAvaliacao(8.4);
		filme2.setDuracao(117);
		
		listaDiretores = new String[] {"Bob Persichetti"};
		listaEscritores = new String[] {"Phil Lord"};
		listaEstrelas = new String[] {"Shameik Moore", "Jake Johnson", "Hailee Steinfeld"};
		listaGeneros =  new String[] {"Aventura", "Drama", "Ação"};
		
		filme2.setDiretor(listaDiretores);
		filme2.setEscritor(listaEscritores);
		filme2.setEstrelas(listaEstrelas);
		filme2.setGenero(listaGeneros);
		
		System.out.println();
		System.out.println(filme2.toString());
		
		
		
		
		
	}
}
