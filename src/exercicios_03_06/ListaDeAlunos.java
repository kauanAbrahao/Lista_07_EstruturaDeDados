package exercicios_03_06;

public class ListaDeAlunos {	
		Aluno inicio;
		Aluno fim;
		int tamanho;
		
		public ListaDeAlunos() {
			this.inicio = null;
			this.fim = null;
			this.tamanho = 0;
			
		}
//		--------------------------------------------------------------------------------------------------	
		public void inserirInicio(Aluno no) {
			
			no.anterior = null;
			no.setProx(inicio);
			
			if (inicio != null) {
				inicio.setAnterior(no);
			}
			inicio = no;
			if (isEmpty()) {
				fim = inicio;
			}
			tamanho++;
			
		}
//		-----------------------------------------------------------------------------------------------------------
		public void inserirFinal(Aluno no) {			
			no.setProx(null);
			no.setAnterior(fim);
			
			if (fim != null) {
				fim.setProx(no);
			}
			fim = no;
			if (isEmpty()) {
				inicio = fim;
			}
			tamanho++;
		}
		
//		-------------------------------------------------------------------------------------------
		public void removerInicio() {
			
			if (isEmpty()) {
				System.out.println("Lista vazia, não há elementos para serem retirados");
			}
			String out = inicio.getNome();
			inicio = inicio.getProx();
			if (inicio != null) {
				inicio.setAnterior(null);
			}
			else {
				fim = null;
			}
			tamanho--;
			System.out.println("removido: " + out);
		}
		
//		------------------------------------------------------------------------------------------
		public void removerFinal() {
			if (isEmpty()) {
				System.out.println("Lista vazia, não há elementos para serem retirados");
			}
			else {
				String out = fim.getNome();
				fim = fim.getAnterior();
				if (fim != null) {
					fim.setProx(null);
				}
				else {
					inicio = null;
				}
				tamanho--;
				System.out.println( "removido: " + out); 
			}
			
			
		}
//		--------------------------------------------------------------------------------------
		
		
		public void mostraLista() {
			Aluno aux = inicio;
			String r = "";
			while (aux != null) {
				r = r + "Nome:" + aux.getNome() + ", id#" + aux.getId() + " " + "\n";
				aux = aux.getProx();
			}
			System.out.println("== ALUNOS ==");
			System.out.println(r);
			
		}
//		-------------------------------------------------------------------
		public boolean isEmpty() {
				if (tamanho == 0) {
					return true;
				}
				else {
					return false;
				}
		}
	

}
