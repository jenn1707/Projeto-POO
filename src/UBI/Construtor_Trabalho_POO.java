package UBI;

import java.io.Serializable;
import java.time.LocalDate;

public class Construtor_Trabalho_POO implements Serializable {
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
	private String nomeAmigo;
	private LocalDate dataEmprestimo;
	private boolean emprestado;
	
	// Empty constructor (used when creating a new movie step-by-step via setters)
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
		nomeAmigo= "";
		dataEmprestimo = null;
		emprestado = false;
		
	}

	// Parameterized constructor (allows creating a complete movie object in one line)
	public Construtor_Trabalho_POO(String titulo, String subTitulo, LocalDate data, int idademin,
			double avaliacao, double duracao, String[] diretor, String[] escritor,
			String[] estrelas, String[] genero) {
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.data = data;
		this.idademin = idademin;
		this.avaliacao = avaliacao;
		this.duracao = duracao;
		this.diretor = diretor;
		this.escritor = escritor;
		this.estrelas = estrelas;
		this.genero = genero;
		this.nomeAmigo= "";
		this.dataEmprestimo = null;
		this.emprestado = false;
		}

	// Setters
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
	
	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	// Getters
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
	
	public String getNomeAmigo() {
		return nomeAmigo;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}
	
	@Override
	public String toString() {
		return "--- DADOS DO FILME ---"
				+ "\nTítulo: " + titulo
				+ "\nSubTítulo: " + subTitulo
				+ "\nData de lançamento: " + data
				+ "\nClassificação etária: " + idademin
				+ "\nAvaliação: " + avaliacao
				+ "\nDuração do filme: " + duracao
				+ "\nDiretor(es) de produção: " + String.join(", ", diretor)
				+ "\nEscritor(es) do filme: " + String.join(", ", escritor)
				+ "\nEstrela(s) do filme: " + String.join(", ", estrelas)
				+ "\nGenero(s) do Filme: " + String.join(", ", genero);
	}
}