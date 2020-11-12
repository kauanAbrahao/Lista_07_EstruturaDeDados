package exercicios_03_06;

public class Disciplina {
	Disciplina anterior;
	Disciplina prox;
	private int id;
	private String nome;
	
	public Disciplina(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public Disciplina getAnterior() {
		return anterior;
	}

	public void setAnterior(Disciplina anterior) {
		this.anterior = anterior;
	}

	public Disciplina getProx() {
		return prox;
	}

	public void setProx(Disciplina prox) {
		this.prox = prox;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
