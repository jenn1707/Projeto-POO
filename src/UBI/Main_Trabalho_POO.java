package UBI;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main_Trabalho_POO {
	public static void main(String[] args) {
		// G10
		// Jennifer Calvopina 55462
		// Nicolas Laurindo 55636
		// Filipe Pedro 55870
		// Rodrigo Freire 56287

		// Tenta carregar os filmes guardados no ficheiro
		ArrayList<Construtor_Trabalho_POO> catalogoFilmes = GestorFicheiros.carregarCatalogo();

		// Se o ficheiro ainda não existir, criar e guardar os 12 filmes default
		if (catalogoFilmes.isEmpty()) {
			System.out.println("Nenhum ficheiro encontrado. A criar catálogo inicial...");
			inicializarFilmesPadrao(catalogoFilmes);
			GestorFicheiros.guardarCatalogo(catalogoFilmes);
		} else {
			System.out.println("Catálogo carregado com sucesso! (" + catalogoFilmes.size() + " filmes)");
		}

		int opcao = 0;

		while (opcao != 9) {
			System.out.println("\n=== O MEU VIDEOCLUBE ===");
			System.out.println("1. Ver todos os filmes");
			System.out.println("2. Procurar filmes por categoria (Género)");
			System.out.println("3. Procurar filmes por ano de estreia");
			System.out.println("4. Adicionar um novo filme");
			System.out.println("5. Remover um filme");
			System.out.println("6. Emprestar um filme");
			System.out.println("7. Devolver um filme");
			System.out.println("8. Ver filmes emprestados");
			System.out.println("9. Sair do programa");
			System.out.print("Escolha uma opção: ");

			opcao = Ler.umInt();

			if (opcao == 1) {
				System.out.println("\n--- LISTA DE TODOS OS FILMES ---");
				for (int i = 0; i < catalogoFilmes.size(); i++) {
					System.out.println((i + 1) + ". " + catalogoFilmes.get(i).getTitulo() + " ("
							+ catalogoFilmes.get(i).getData().getYear() + ")");
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
				System.out.println("\n--- REGISTAR NOVA AQUISIÇÃO ---");
				Construtor_Trabalho_POO novoFilme = new Construtor_Trabalho_POO();

				System.out.print("Título do filme: ");
				novoFilme.setTitulo(Ler.umaString());

				System.out.print("Subtítulo do filme: ");
				novoFilme.setsubTitulo(Ler.umaString());

				LocalDate dataValida = null;
				while (dataValida == null) {
					try {
						System.out.print("Ano de estreia (ex: 2023): ");
						int ano = Ler.umInt();
						System.out.print("Mês de estreia (1-12): ");
						int mes = Ler.umInt();
						System.out.print("Dia de estreia (1-31): ");
						int dia = Ler.umInt();
						dataValida = LocalDate.of(ano, mes, dia);
					} catch (DateTimeException e) {
						System.out.println("Data inválida! Tente novamente.");
					}
				}
				novoFilme.setData(dataValida);

				System.out.print("Idade mínima recomendada: ");
				novoFilme.setIdademin(Ler.umInt());

				System.out.print("Avaliação (ex: 8.5): ");
				novoFilme.setAvaliacao(Ler.umDouble());

				System.out.print("Duração em minutos: ");
				novoFilme.setDuracao(Ler.umDouble());

				System.out.print("Género principal (em portugués): ");
				String[] novoGenero = { Ler.umaString() };
				novoFilme.setGenero(novoGenero);

				System.out.print("Diretor principal: ");
				String[] novoDiretor = { Ler.umaString() };
				novoFilme.setDiretor(novoDiretor);

				System.out.print("Escritor principal: ");
				String[] novoEscritor = { Ler.umaString() };
				novoFilme.setEscritor(novoEscritor);

				System.out.print("Estrela principal (Ator/Atriz): ");
				String[] novaEstrela = { Ler.umaString() };
				novoFilme.setEstrelas(novaEstrela);

				catalogoFilmes.add(novoFilme);
				GestorFicheiros.guardarCatalogo(catalogoFilmes);
				System.out.println("\n✅ Sucesso! Filme adicionado e guardado no ficheiro.");

			} else if (opcao == 5) {
				System.out.println("\n--- REMOVER FILME ---");
				for (int i = 0; i < catalogoFilmes.size(); i++) {
					System.out.println((i + 1) + ". " + catalogoFilmes.get(i).getTitulo());
				}
				System.out.print("Digite o número do filme a remover (0 para cancelar): ");
				int indice = Ler.umInt();

				if (indice > 0 && indice <= catalogoFilmes.size()) {
					Construtor_Trabalho_POO removido = catalogoFilmes.remove(indice - 1);
					GestorFicheiros.guardarCatalogo(catalogoFilmes);
					System.out.println("🗑️ Filme '" + removido.getTitulo() + "' removido com sucesso.");
				} else if (indice != 0) {
					System.out.println("Número inválido.");
				}

			} else if (opcao == 6) {
				System.out.println("\n--- EMPRESTAR FILME ---");
				for (int i = 0; i < catalogoFilmes.size(); i++) {
					Construtor_Trabalho_POO f = catalogoFilmes.get(i);
					String estado = f.isEmprestado() ? " [EMPRESTADO a " + f.getNomeAmigo() + "]" : " [DISPONÍVEL]";
					System.out.println((i + 1) + ". " + f.getTitulo() + estado);
				}
				System.out.print("Digite o número do filme a emprestar (0 para cancelar): ");
				int indice = Ler.umInt();

				if (indice > 0 && indice <= catalogoFilmes.size()) {
					Construtor_Trabalho_POO filme = catalogoFilmes.get(indice - 1);
					if (filme.isEmprestado()) {
						System.out.println("Este filme já está emprestado a " + filme.getNomeAmigo() + ".");
					} else {
						System.out.print("Nome do amigo ou conhecido: ");
						String amigo = Ler.umaString();

						filme.setEmprestado(true);
						filme.setNomeAmigo(amigo);
						filme.setDataEmprestimo(LocalDate.now());

						GestorFicheiros.guardarCatalogo(catalogoFilmes);
						System.out.println("✅ Filme '" + filme.getTitulo() + "' emprestado a " + amigo + " em "
								+ filme.getDataEmprestimo() + ".");
					}
				} else if (indice != 0) {
					System.out.println("Número inválido.");
				}
			} else if (opcao == 7) {
				System.out.println("\n--- DEVOLVER FILME ---");
				boolean haEmprestados = false;
				for (int i = 0; i < catalogoFilmes.size(); i++) {
					Construtor_Trabalho_POO f = catalogoFilmes.get(i);
					if (f.isEmprestado()) {
						System.out
								.println((i + 1) + ". " + f.getTitulo() + " (Emprestado a: " + f.getNomeAmigo() + ")");
						haEmprestados = true;
					}
				}

				if (!haEmprestados) {
					System.out.println("Não há filmes emprestados neste momento.");
				} else {
					System.out.print("Digite o número do filme a devolver (0 para cancelar): ");
					int indice = Ler.umInt();

					if (indice > 0 && indice <= catalogoFilmes.size()) {
						Construtor_Trabalho_POO filme = catalogoFilmes.get(indice - 1);
						if (!filme.isEmprestado()) {
							System.out.println("Esse filme não está emprestado.");
						} else {
							filme.setEmprestado(false);
							filme.setNomeAmigo("");
							filme.setDataEmprestimo(null);

							GestorFicheiros.guardarCatalogo(catalogoFilmes);
							System.out.println("✅ Filme '" + filme.getTitulo() + "' devolvido com sucesso!");
						}
					} else if (indice != 0) {
						System.out.println("Número inválido.");
					}
				}

			} else if (opcao == 8) {
				System.out.println("\n--- FILMES EMPRESTADOS ---");
				boolean haEmprestados = false;
				for (int i = 0; i < catalogoFilmes.size(); i++) {
					Construtor_Trabalho_POO f = catalogoFilmes.get(i);
					if (f.isEmprestado()) {
						System.out.println("- " + f.getTitulo() + " | Amigo: " + f.getNomeAmigo() + " | Data: "
								+ f.getDataEmprestimo());
						haEmprestados = true;
					}
				}

				if (!haEmprestados) {
					System.out.println("Todos os filmes estão disponíveis no catálogo.");
				}
			} else if (opcao == 9) {
				System.out.println("\nA fechar o programa... Até logo!");
			} else {
				System.out.println("\nOpção inválida. Tente novamente.");
			}
		}

	}

	private static void inicializarFilmesPadrao(ArrayList<Construtor_Trabalho_POO> catalogoFilmes) {
		// Filme 1
		Construtor_Trabalho_POO filme1 = new Construtor_Trabalho_POO();
		filme1.setTitulo("Home Alone 2");
		filme1.setsubTitulo("Lost in New York");
		filme1.setData(LocalDate.of(1992, 11, 20));
		filme1.setIdademin(10);
		filme1.setAvaliacao(6.8);
		filme1.setDuracao(120.0);
		filme1.setDiretor(new String[] { "Chris Columbus" });
		filme1.setEscritor(new String[] { "John Hughes" });
		filme1.setEstrelas(new String[] { "Macaulay Culkin", "Joe Pesci", "Daniel Stern" });
		filme1.setGenero(new String[] { "Comédia", "Familiar", "Aventura" });
		catalogoFilmes.add(filme1);

		// Filme 2
		Construtor_Trabalho_POO filme2 = new Construtor_Trabalho_POO();
		filme2.setTitulo("Homem-Aranha");
		filme2.setsubTitulo("No Universo Aranha");
		filme2.setData(LocalDate.of(2018, 12, 13));
		filme2.setIdademin(6);
		filme2.setAvaliacao(8.4);
		filme2.setDuracao(117);
		filme2.setDiretor(new String[] { "Bob Persichetti" });
		filme2.setEscritor(new String[] { "Phil Lord" });
		filme2.setEstrelas(new String[] { "Shameik Moore", "Jake Johnson", "Hailee Steinfeld" });
		filme2.setGenero(new String[] { "Aventura", "Drama", "Ação" });
		catalogoFilmes.add(filme2);

		// Filme 3
		Construtor_Trabalho_POO filme3 = new Construtor_Trabalho_POO();
		filme3.setTitulo("Crazy, Stupid, Love");
		filme3.setsubTitulo("");
		filme3.setData(LocalDate.of(2011, 9, 22));
		filme3.setIdademin(13);
		filme3.setAvaliacao(7.4);
		filme3.setDuracao(118);
		filme3.setDiretor(new String[] { "Glenn Ficarra" });
		filme3.setEscritor(new String[] { "Dan Fogelman" });
		filme3.setEstrelas(new String[] { "Steve Carell", "Ryan Gosling", "Julianne Moore" });
		filme3.setGenero(new String[] { "Comédia", "Romance", "Drama" });
		catalogoFilmes.add(filme3);

		// Filme 4
		Construtor_Trabalho_POO filme4 = new Construtor_Trabalho_POO();
		filme4.setTitulo("Five Nights at Freddy's 2");
		filme4.setsubTitulo("");
		filme4.setData(LocalDate.of(2025, 12, 4));
		filme4.setIdademin(14);
		filme4.setAvaliacao(5.1);
		filme4.setDuracao(104);
		filme4.setDiretor(new String[] { "Emma Tammi" });
		filme4.setEscritor(new String[] { "Scott Cawthon" });
		filme4.setEstrelas(new String[] { "Josh Hutcherson", "Piper Rubio", "Elizabeth Lail" });
		filme4.setGenero(new String[] { "Terror", "Mistério", "Suspense" });
		catalogoFilmes.add(filme4);

		// Filme 5
		Construtor_Trabalho_POO filme5 = new Construtor_Trabalho_POO();
		filme5.setTitulo("Sonic 3");
		filme5.setsubTitulo("O Filme");
		filme5.setData(LocalDate.of(2024, 12, 26));
		filme5.setIdademin(6);
		filme5.setAvaliacao(6.9);
		filme5.setDuracao(110);
		filme5.setDiretor(new String[] { "Jeff Fowler" });
		filme5.setEscritor(new String[] { "Pat Casey" });
		filme5.setEstrelas(new String[] { "Jim Carrey", "Ben Schwartz", "Keanu Reeves" });
		filme5.setGenero(new String[] { "Aventura", "Fantasia", "Ação" });
		catalogoFilmes.add(filme5);

		// Filme 6
		Construtor_Trabalho_POO filme6 = new Construtor_Trabalho_POO();
		filme6.setTitulo("Chicken Run");
		filme6.setsubTitulo("");
		filme6.setData(LocalDate.of(2000, 6, 17));
		filme6.setIdademin(4);
		filme6.setAvaliacao(7.1);
		filme6.setDuracao(84);
		filme6.setDiretor(new String[] { "Peter Lord" });
		filme6.setEscritor(new String[] { "Nick Park" });
		filme6.setEstrelas(new String[] { "Mel Gibson", "Lynn Ferguson", "Phil Daniels" });
		filme6.setGenero(new String[] { "Aventura", "Comédia", "Animação" });
		catalogoFilmes.add(filme6);

		// Filme 7
		Construtor_Trabalho_POO filme7 = new Construtor_Trabalho_POO();
		filme7.setTitulo("Princess Mononoke");
		filme7.setsubTitulo("");
		filme7.setData(LocalDate.of(1997, 7, 12));
		filme7.setIdademin(14);
		filme7.setAvaliacao(8.3);
		filme7.setDuracao(113);
		filme7.setDiretor(new String[] { "Hayao Miyazaki" });
		filme7.setEscritor(new String[] { "Hayao Miyazaki" });
		filme7.setEstrelas(new String[] { "Yôji Matsuda", "Yuriko Ishida", "Yûko Tanaka" });
		filme7.setGenero(new String[] { "Animação", "Aventura", "Fantasia" });
		catalogoFilmes.add(filme7);

		// Filme 8
		Construtor_Trabalho_POO filme8 = new Construtor_Trabalho_POO();
		filme8.setTitulo("Dune");
		filme8.setsubTitulo("Part 2");
		filme8.setData(LocalDate.of(2024, 2, 29));
		filme8.setIdademin(12);
		filme8.setAvaliacao(8.4);
		filme8.setDuracao(166);
		filme8.setDiretor(new String[] { "Denis Villeneuve" });
		filme8.setEscritor(new String[] { "Denis Villeneuve", "Jon Spaihts" });
		filme8.setEstrelas(new String[] { "Timothée Chalamet", "Zendaya", "Rebecca Ferguson" });
		filme8.setGenero(new String[] { "Ficção Científica", "Ação", "Drama" });
		catalogoFilmes.add(filme8);

		// Filme 9
		Construtor_Trabalho_POO filme9 = new Construtor_Trabalho_POO();
		filme9.setTitulo("Interstellar");
		filme9.setsubTitulo("");
		filme9.setData(LocalDate.of(2014, 11, 6));
		filme9.setIdademin(13);
		filme9.setAvaliacao(8.7);
		filme9.setDuracao(169);
		filme9.setDiretor(new String[] { "Christopher Nolan" });
		filme9.setEscritor(new String[] { "Christopher Nolan", "Jonathan Nolan" });
		filme9.setEstrelas(new String[] { "Matthew McConaughey", "Anne Hathaway", "Jessica Chastain" });
		filme9.setGenero(new String[] { "Ficção Científica", "Aventura", "Drama" });
		catalogoFilmes.add(filme9);

		// Filme 10
		Construtor_Trabalho_POO filme10 = new Construtor_Trabalho_POO();
		filme10.setTitulo("The Blair Witch Project");
		filme10.setsubTitulo("");
		filme10.setData(LocalDate.of(1999, 10, 30));
		filme10.setIdademin(18);
		filme10.setAvaliacao(6.5);
		filme10.setDuracao(81);
		filme10.setDiretor(new String[] { "Daniel Myrick" });
		filme10.setEscritor(new String[] { "Daniel Myrick", "Heather Donahue" });
		filme10.setEstrelas(new String[] { "Heather Donahue", "Michael C. Williams", "Joshua Leonard" });
		filme10.setGenero(new String[] { "Terror", "Filmagem encontrada", "Supernatural" });
		catalogoFilmes.add(filme10);

		// Filme 11
		Construtor_Trabalho_POO filme11 = new Construtor_Trabalho_POO();
		filme11.setTitulo("Coraline");
		filme11.setsubTitulo("");
		filme11.setData(LocalDate.of(2009, 2, 19));
		filme11.setIdademin(13);
		filme11.setAvaliacao(7.8);
		filme11.setDuracao(100);
		filme11.setDiretor(new String[] { "Henry Selick" });
		filme11.setEscritor(new String[] { "Henry Selick", "Neil Gaiman" });
		filme11.setEstrelas(new String[] { "Dakota Fanning", "Teri Hatcher", "John Hodgman" });
		filme11.setGenero(new String[] { "Terror", "Fantasia", "Animação" });
		catalogoFilmes.add(filme11);

		// Filme 12
		Construtor_Trabalho_POO filme12 = new Construtor_Trabalho_POO();
		filme12.setTitulo("Friday the 13th");
		filme12.setsubTitulo("");
		filme12.setData(LocalDate.of(1981, 3, 13));
		filme12.setIdademin(18);
		filme12.setAvaliacao(6.3);
		filme12.setDuracao(95);
		filme12.setDiretor(new String[] { "Sean S. Cunningham" });
		filme12.setEscritor(new String[] { "Victor Miller", "Ron Kurz" });
		filme12.setEstrelas(new String[] { "Betsy Palmer", "Adrienne King", "Jeannine Taylor" });
		filme12.setGenero(new String[] { "Terror", "Supernatural", "Ficção Científica" });
		catalogoFilmes.add(filme12);
	}
}