package exercicios_03_06;

public class Aluno {
	Aluno anterior;
	Aluno prox;
	private int id;
	private String nome;
	private String curso;
	private String semestre;
	
	public Aluno(int id, String nome, String curso, String semestre) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.semestre = semestre;
	}
	
	public Aluno() {
		
	}

	public int getId() {
		return id;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Aluno getAnterior() {
		return anterior;
	}

	public void setAnterior(Aluno anterior) {
		this.anterior = anterior;
	}

	public Aluno getProx() {
		return prox;
	}

	public void setProx(Aluno prox) {
		this.prox = prox;
	}
	
	
	

}
