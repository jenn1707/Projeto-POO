package UBI;
import java.time.LocalDate;
import java.io.Serializable;
public class Construtor_Trabalho_POO implements Serializable{
	private static final long serialVersionUID = 1L;
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
			this.diretor = diretor;
	}

	public void setEscritor(String[] escritor) {
			this.escritor = escritor;
	}

	public void setEstrelas(String[] estrelas) {
		this.estrelas = estrelas;
	}
	
	public void setGenero(String[] genero) {
		this.genero = genero;
}

	public String getTitulo() {
		return titulo;
	}
	public String getsubTitulo() {
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
	public String[] getDiretor() {
		return diretor;
	}
	public String[] getEscritor() {
		return escritor;
	}
	public String[] getEstrelas() {
		return estrelas;
	}
	public String[] getGenero() {
		return genero;
	}
	public String toString() {
		String s;
		s = "--- DADOS DO FILME ---" + "\nTítulo: " + titulo + "\nSubTítulo: " + subTitulo + "\nData de lançamento: " + data + "\nClassificação etária: " + idademin + "\nAvaliação: " + avaliacao + "\nDuração do filme: " + duracao + "\nDiretor(es) de produção: " ;
		for(int a = 0; a<diretor.length;a++)
			s += diretor[a] + ", ";
		s = s + "\nEscritor(es) do filme: ";
		for(int b = 0; b<escritor.length;b++)
			s += escritor[b] + ", ";
		s = s + "\nEstrela(s) do filme: ";
		for(int c = 0; c<estrelas.length;c++)
			s += estrelas[c] + ", ";
		s = s + "\nGenero(s) do Filme: ";
		for(int d = 0; d<genero.length;d++)
			s += genero[d] + ", ";
		return s;
	}
	
}
