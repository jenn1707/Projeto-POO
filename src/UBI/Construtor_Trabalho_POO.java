package UBI;
import java.time.LocalDate;
public class Construtor_Trabalho_POO {
	private String titulo;
	private String subTitulo;
	private LocalDate data;
	private int idademin;
	private double avaliacao;
	private double duracao;
	private String[] diretor;
	private String[] escritor;
	private String[] estrelas;
	private String[] genero;

	public Construtor_Trabalho_POO() {
		titulo = "";
		subTitulo = "";
		data = null;
		idademin = 0;
		avaliacao = 0;
		duracao = 0;
		diretor = new String[0];
		escritor = new String[0];
		estrelas = new String[0];
		genero = new String[0];
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setsubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setIdademin(int idademin) {
		this.idademin = idademin;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public void setDiretor(String[] diretor) {
		for (int a = 0; a < diretor.length; a++) {
			this.diretor[a] = diretor[a];
		}
	}

	public void setEscritor(String[] escritor) {
		for (int b = 0; b < escritor.length; b++) {
			this.escritor[b] = escritor[b];
		}
	}

	public void setEstrela(String[] estrelas) {
		for (int c = 0; c < estrelas.length; c++) {
			this.estrelas[c] = estrelas[c];
		}
	}

	public void setGenero(String[] genero) {
		for (int d = 0; d < genero.length; d++) {
			this.genero[d] = genero[d];
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public String getSubTitulo() {
		return subTitulo;
	}
	public LocalDate getData() {
		return data;
	}
	public int getIdademin() {
		return idademin;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public double getDuracao() {
		return duracao;
	}
}
