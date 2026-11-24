package UBI;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheiros {
	private static final String NOME_FICHEIRO = "catalogo_filmes.dat";

    // Saves the entire ArrayList to the file
    public static void guardarCatalogo(ArrayList<Construtor_Trabalho_POO> catalogo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_FICHEIRO))) {
            oos.writeObject(catalogo);
            System.out.println("Alterações guardadas com sucesso em '" + NOME_FICHEIRO + "'!");
        } catch (IOException e) {
            System.out.println("Erro ao guardar o ficheiro: " + e.getMessage());
        }
    }

    // Loads the ArrayList from the file (returns an empty list if the file doesn't exist yet)
    @SuppressWarnings("unchecked")
    public static ArrayList<Construtor_Trabalho_POO> carregarCatalogo() {
        File ficheiro = new File(NOME_FICHEIRO);
        if (!ficheiro.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro))) {
            return (ArrayList<Construtor_Trabalho_POO>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar o ficheiro: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
