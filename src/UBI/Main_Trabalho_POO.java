package UBI;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main_Trabalho_POO {
	public static void main(String[] args) {
		// G10
		//Jennifer Calvopina 55462
		//Nicolas Laurindo 55636
		//Filipe Pedro 55870
		//Rodrigo Freire 56287
		
		ArrayList<Construtor_Trabalho_POO> catalogoFilmes = new ArrayList<>();
		
		
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
		
		catalogoFilmes.add(filme1);
		
		
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
		
		System.out.println("\n" + filme2.toString());
		catalogoFilmes.add(filme2);
		
		Construtor_Trabalho_POO filme3 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2011, 9, 22);
		filme3.setTitulo("Crazy, Stupid, Love");
		filme3.setsubTitulo(".");
		filme3.setData(dataEstreia);
		filme3.setIdademin(13);
		filme3.setAvaliacao(7.4);
		filme3.setDuracao(118);
		
		listaDiretores = new String[] {"Gleen Ficarra"};
		listaEscritores = new String[] {"Dan Fogelman"};
		listaEstrelas = new String[] {"Steve Carell", "Ryan Gosling", "Julianne Moore"};
		listaGeneros =  new String[] {"Comedy", "Romance", "feel-Good Romance"};
		
		filme3.setDiretor(listaDiretores);
		filme3.setEscritor(listaEscritores);
		filme3.setEstrelas(listaEstrelas);
		filme3.setGenero(listaGeneros);
		
		System.out.println("\n" + filme3.toString());
		catalogoFilmes.add(filme3);
		
		Construtor_Trabalho_POO filme4 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2025, 12, 4);
		filme4.setTitulo("Five Nights at Freddy's 2");
		filme4.setsubTitulo(" ");
		filme4.setData(dataEstreia);
		filme4.setIdademin(14);
		filme4.setAvaliacao(5.1);
		filme4.setDuracao(104);
		
		listaDiretores = new String[] {"Emma Tammi"};
		listaEscritores = new String[] {"Scott Cawthon"};
		listaEstrelas = new String[] {"Josh Hutcherson", "Piper Rubio", "Elizabeth Lail"};
		listaGeneros =  new String[] {"Horror", "Mistério", "Thriller"};
		
		filme4.setDiretor(listaDiretores);
		filme4.setEscritor(listaEscritores);
		filme4.setEstrelas(listaEstrelas);
		filme4.setGenero(listaGeneros);
		
		System.out.println("\n" + filme4.toString());
		catalogoFilmes.add(filme4);
		
		
		Construtor_Trabalho_POO filme5 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2024, 12, 26);
		filme5.setTitulo("Sonic 3");
		filme5.setsubTitulo("O Filme");
		filme5.setData(dataEstreia);
		filme5.setIdademin(6);
		filme5.setAvaliacao(6.9);
		filme5.setDuracao(110);
		
		listaDiretores = new String[] {"Jeff Fowler"};
		listaEscritores = new String[] {"Pat Casey"};
		listaEstrelas = new String[] {"Jim Carrey", "Ben Schwartz", "Keanu Reeves"};
		listaGeneros =  new String[] {"Aventura", "Fantasia", "Ação"};
		
		filme5.setDiretor(listaDiretores);
		filme5.setEscritor(listaEscritores);
		filme5.setEstrelas(listaEstrelas);
		filme5.setGenero(listaGeneros);
		
		System.out.println("\n" + filme5.toString());
		catalogoFilmes.add(filme5);
		
		Construtor_Trabalho_POO filme6 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2000, 6, 17);
		filme6.setTitulo("Chicken Run");
		filme6.setsubTitulo(" ");
		filme6.setData(dataEstreia);
		filme6.setIdademin(4);
		filme6.setAvaliacao(7.1);
		filme6.setDuracao(84);
		
		listaDiretores = new String[] { "Peter Lord"};
		listaEscritores = new String[] {"Nick Park"};
		listaEstrelas = new String[] {"Mel Gibson", "Lynn Ferguson", "Phil Daniels"};
		listaGeneros =  new String[] {"Aventura", "Comedia", "Stop-Motion"};
		
		filme6.setDiretor(listaDiretores);
		filme6.setEscritor(listaEscritores);
		filme6.setEstrelas(listaEstrelas);
		filme6.setGenero(listaGeneros);
		
		System.out.println("\n" + filme6.toString());
		catalogoFilmes.add(filme6);
		
		Construtor_Trabalho_POO filme7 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(1997, 7, 12);
		filme7.setTitulo("Princess Mononoke");
		filme7.setsubTitulo(".");
		filme7.setData(dataEstreia);
		filme7.setIdademin(14);
		filme7.setAvaliacao(8.3);
		filme7.setDuracao(113);
		
		listaDiretores = new String[] {"Hayao Miyazaki"};
		listaEscritores = new String[] {"Hayao Miyazaki"};
		listaEstrelas = new String[] {" Yôji Matsuda" , "Yuriko Ishida" ,  "Yûko Tanaka"};
		listaGeneros =  new String[] {"Animação", "Aventura", "Fantasia"};
		
		filme7.setDiretor(listaDiretores);
		filme7.setEscritor(listaEscritores);
		filme7.setEstrelas(listaEstrelas);
		filme7.setGenero(listaGeneros);
		
		System.out.println("\n" + filme7.toString());
		catalogoFilmes.add(filme7);
		
		Construtor_Trabalho_POO filme8 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2024, 2, 29);
		filme8.setTitulo("Dune");
		filme8.setsubTitulo("Part 2");
		filme8.setData(dataEstreia);
		filme8.setIdademin(12);
		filme8.setAvaliacao(8.4);
		filme8.setDuracao(166);
		
		listaDiretores = new String[] {"Denis Villeneuve"};
		listaEscritores = new String[] {"Denis Villeneuve", "Jon Spaihts"};
		listaEstrelas = new String[] {" Timothée Chalamet" , "Zendaya" ,  "Rebecca Ferguson"};
		listaGeneros =  new String[] {"Ficção Científica", "Ação", "Drama"};
		
		filme8.setDiretor(listaDiretores);
		filme8.setEscritor(listaEscritores);
		filme8.setEstrelas(listaEstrelas);
		filme8.setGenero(listaGeneros);
		
		System.out.println("\n" + filme8.toString());
		catalogoFilmes.add(filme8);
		
		Construtor_Trabalho_POO filme9 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2014, 11, 6);
		filme9.setTitulo("Interstellar");
		filme9.setsubTitulo(".");
		filme9.setData(dataEstreia);
		filme9.setIdademin(13);
		filme9.setAvaliacao(8.7);
		filme9.setDuracao(169);
		
		listaDiretores = new String[] {"Christopher Nolan"};
		listaEscritores = new String[] {"Christopher Nolan", "Jonathan Nolan"};
		listaEstrelas = new String[] {" Matthew McConaughey" , "Anne Hathaway" ,  "Jessica Chastain"};
		listaGeneros =  new String[] {"Ficção Científica", "Aventura", "Drama"};
		
		filme9.setDiretor(listaDiretores);
		filme9.setEscritor(listaEscritores);
		filme9.setEstrelas(listaEstrelas);
		filme9.setGenero(listaGeneros);
		
		System.out.println("\n" + filme9.toString());
		catalogoFilmes.add(filme9);
		
		
		Construtor_Trabalho_POO filme10 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(1999, 10, 30);
		filme10.setTitulo("The Blair Witch Project");
		filme10.setsubTitulo("");
		filme10.setData(dataEstreia);
		filme10.setIdademin(18);
		filme10.setAvaliacao(6.5);
		filme10.setDuracao(81);
		
		listaDiretores = new String[] {"Daniel Myrick"};
		listaEscritores = new String[] {"Daniel Myrick", "Heather Donahue"};
		listaEstrelas = new String[] {"Heather Donahue", "Michael C. Williams", "Joshua Leonard"};
		listaGeneros =  new String[] {"Horror", "Found Footage Horror", "Supernatural"};
		
		filme10.setDiretor(listaDiretores);
		filme10.setEscritor(listaEscritores);
		filme10.setEstrelas(listaEstrelas);
		filme10.setGenero(listaGeneros);
		
		System.out.println("\n" + filme10.toString());
		catalogoFilmes.add(filme10);
		
		Construtor_Trabalho_POO filme11 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(2009, 2, 19);
		filme11.setTitulo("Coraline");
		filme11.setsubTitulo("");
		filme11.setData(dataEstreia);
		filme11.setIdademin(13);
		filme11.setAvaliacao(7.8);
		filme11.setDuracao(100);
		
		listaDiretores = new String[] {"Henry Selick"};
		listaEscritores = new String[] {"Henry Selick", "Neil Gailman"};
		listaEstrelas = new String[] {"Dakota Fanning", "Teri Hatcher", "John Hodman"};
		listaGeneros =  new String[] {"Horror", "Dark Fantasy", "Stop Motion Animation"};
		
		filme11.setDiretor(listaDiretores);
		filme11.setEscritor(listaEscritores);
		filme11.setEstrelas(listaEstrelas);
		filme11.setGenero(listaGeneros);
		
		System.out.println("\n" + filme11.toString());
		catalogoFilmes.add(filme11);
		
		
		Construtor_Trabalho_POO filme12 = new Construtor_Trabalho_POO();
		dataEstreia = LocalDate.of(1981, 3, 13);
		filme12.setTitulo("Friday the 13th");
		filme12.setsubTitulo("");
		filme12.setData(dataEstreia);
		filme12.setIdademin(18);
		filme12.setAvaliacao(6.3);
		filme12.setDuracao(95);
		
		listaDiretores = new String[] {"Sean S. Cunningham"};
		listaEscritores = new String[] {"Victor Miller", "Ron Kurz"};
		listaEstrelas = new String[] {"Betsy Palmer", "Adrienne King", "Jeannine Taylor"};
		listaGeneros =  new String[] {"Horror", "Slasher Horror", "Teen Horror"};
		
		filme12.setDiretor(listaDiretores);
		filme12.setEscritor(listaEscritores);
		filme12.setEstrelas(listaEstrelas);
		filme12.setGenero(listaGeneros);
		
		System.out.println("\n" + filme12.toString());
		catalogoFilmes.add(filme12);
		
		System.out.println("\nTotal de filmes no catálogo: " + catalogoFilmes.size());
		
		int opcao = 0;

		while (opcao != 4) {
		    System.out.println("\n=== O MEU VIDEOCLUBE ===");
		    System.out.println("1. Ver todos os filmes");
		    System.out.println("2. Procurar filmes por categoria (Género)");
		    System.out.println("3. Procurar filmes por ano de estreia");
		    System.out.println("4. Sair do programa");
		    System.out.print("Escolha uma opção: ");
		    
		    
		    opcao = Ler.umInt(); 
		    
		    if (opcao == 1) {
		        System.out.println("\n--- LISTA DE TODOS OS FILMES ---");
		        for (int i = 0; i < catalogoFilmes.size(); i++) {
		            System.out.println((i + 1) + ". " + catalogoFilmes.get(i).getTitulo() + 
		                               " (" + catalogoFilmes.get(i).getData().getYear() + ")");
		        }
		        
		    } else if (opcao == 2) {
		        System.out.print("\nDigite a categoria que deseja procurar (ex: Comédia, Ação, Drama): ");
		        String categoriaBuscada = Ler.umaString(); 
		        
		        System.out.println("\n--- FILMES NA CATEGORIA: " + categoriaBuscada.toUpperCase() + " ---");
		        boolean encontrou = false;
		        
		        
		        for (int i = 0; i < catalogoFilmes.size(); i++) {
		            String[] generosDoFilme = catalogoFilmes.get(i).getGenero();
		            
		           
		            if (generosDoFilme != null) {
		                for (int j = 0; j < generosDoFilme.length; j++) {
		                    if (generosDoFilme[j].equalsIgnoreCase(categoriaBuscada)) {
		                        System.out.println("- " + catalogoFilmes.get(i).getTitulo());
		                        encontrou = true;
		                        break;
		                    }
		                }
		            }
		        }
		        
		        if (!encontrou) {
		            System.out.println("Nenhum filme encontrado nesta categoria.");
		        }
		    } else if (opcao == 3) {
		        System.out.print("\nDigite o ano de estreia que deseja procurar (ex: 1992): ");
		        int anoBuscado = Ler.umInt();
		        
		        System.out.println("\n--- FILMES DO ANO: " + anoBuscado + " ---");
		        boolean encontrouAno = false;
		        
		        for (int i = 0; i < catalogoFilmes.size(); i++) {
		            if (catalogoFilmes.get(i).getData().getYear() == anoBuscado) {
		                System.out.println("- " + catalogoFilmes.get(i).getTitulo());
		                encontrouAno = true;
		            }
		        }
		        
		        if (!encontrouAno) {
		            System.out.println("Nenhum filme encontrado nesse ano.");
		        }  
		    } else if (opcao == 4) {
		        System.out.println("\nA fechar o programa... Até logo!");
		    } else {
		        System.out.println("\nOpção inválida. Tente novamente.");
		    }
		}
		
	}
}
