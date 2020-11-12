package exercicios_03_06;

public class Media {
	Media anterior;
	Media prox;
	private int idAluno;
	private int idDisciplina;
	private double mediafinal;
	
	
	public Media(int idAluno, int idDisciplina, double mediafinal) {
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.mediafinal = mediafinal;
	}


	public Media getAnterior() {
		return anterior;
	}


	public void setAnterior(Media anterior) {
		this.anterior = anterior;
	}


	public Media getProx() {
		return prox;
	}


	public void setProx(Media prox) {
		this.prox = prox;
	}


	public int getIdAluno() {
		return idAluno;
	}


	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}


	public int getIdDisciplina() {
		return idDisciplina;
	}


	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}


	public double getMediafinal() {
		return mediafinal;
	}


	public void setMediafinal(int mediafinal) {
		this.mediafinal = mediafinal;
	}
	
	
}
