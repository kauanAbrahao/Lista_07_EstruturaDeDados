package exercicios_03_06;

public class ListaDeMedias {
		Media inicio;
		Media fim;
		int tamanho;
		
		public ListaDeMedias() {
			this.inicio = null;
			this.fim = null;
			this.tamanho = 0;
			
		}
		public void inserirInicio(Media no) {
			
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
		public void inserirFinal(Media no) {			
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
			int out = inicio.getIdAluno();
			inicio = inicio.getProx();
			if (inicio != null) {
				inicio.setAnterior(null);
			}
			else {
				fim = null;
			}
			tamanho--;
			System.out.println("removido: #id" + out);
		}
		
//		------------------------------------------------------------------------------------------
		public void removerFinal() {
			if (isEmpty()) {
				System.out.println("Lista vazia, não há elementos para serem retirados");
			}
			else {
				int out = fim.getIdAluno();
				fim = fim.getAnterior();
				if (fim != null) {
					fim.setProx(null);
				}
				else {
					inicio = null;
				}
				tamanho--;
				System.out.println( "removido: #id" + out); 
			}
			
			
		}
//		--------------------------------------------------------------------------------------
		
		
		public void mostraLista() {
			Media aux = inicio;
			String r = "\n";
			while (aux != null) {
				r = r + "Aluno id#" + aux.getIdAluno() + ", Disciplina id#" + aux.getIdDisciplina() + " Média: " + aux.getMediafinal() + "\n";
				aux = aux.getProx();
			}
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
		
//		------------------------------------------------------------------
		public void ordenaLista(int sort) {
			//Transforma a lista em vetor antes do Algoritmo de Sort de fato
			Media vet[] = new Media[this.tamanho];
			vet = criaVetor(vet);
			
			
			if(sort == 1) {
				mergeSort(vet, 0, vet.length-1);	
			} else {
				quickSort(vet, 0, vet.length-1);
			}
			
			inicio = null;
			fim = null;
			this.tamanho=0;
			Media aux;
			
			for (int i = 0; i < vet.length; i++) {
				aux = vet[i];
				inserirInicio(aux);
			}
			
		}
		
//		------------------------------------------------------------------
		
		
		
		private void quickSort(Media[] vet, int l, int r) {
			int p;
			if (l<r) {
				p = particao(vet, l, r);
				quickSort(vet, l, p-1);
				quickSort(vet, p+1, r);
			}		
		}
		
		
		
		private int particao(Media[] vet, int l, int r) {
			double pivo = vet[r].getMediafinal();
			Media aux;
			int i = l-1;
			for (int j = l; j<r; j++) {
				if(vet[j].getMediafinal()<pivo) {
					i++;
					aux = vet[j];
					vet[j] = vet[i];
					vet[i]=aux;
				}
			}
			aux = vet[i+1];
			vet[i+1] = vet[r];
			vet[r] = aux;	
			
			return i+1;
		}	
//	------------------------------------------------------------------------------
		
		private void mergeSort(Media[] vet, int i, int j) {
			if(i<j) {
				int meio = (i+j)/2;
				mergeSort(vet, i, meio);
				mergeSort(vet, meio+1, j);
				merge(vet, i, meio, meio+1, j);
			}
		}
		
		private void merge(Media[] vet, int inicioA, int fimA, int inicioB, int fimB) {
			int i = inicioA;
			int i2 = inicioB;
			int iaux = inicioA;
			Media aux[] = new Media[vet.length];
			
			while(i <= fimA && i2 <= fimB) {
				if (vet[i].getMediafinal() <= vet[i2].getMediafinal()) {
					aux[iaux++] = vet[i++];
				}
				else {
					aux[iaux++] = vet[i2++];
				}
				
			}
			while(i<=fimA) {
				aux[iaux++] = vet[i++];
			}
			while(i2 <= fimB) {
				aux[iaux++] = vet[i2++];
			}
			for(int j = inicioA; j<=fimB; j++) {
				vet[j] = aux[j];
			}
			
		}
		
//		--------------------------------------------------
		
		private Media[] criaVetor(Media vet[]) {
			Media aux = inicio;
			int i = 0;
			
			while(aux!=null) {
				vet[i] = aux;
				i++;
				aux = aux.getProx();
			}
			
			return vet;
		}
		
//	-----------------------------------------------------------
		public void mediaMaiorQueOito() {
			int c = 0;
			Media aux = inicio;
			while(aux!=null) {
				if(aux.getMediafinal() >= 8) {
					c++;
				}
				aux = aux.getProx();
			}
			System.out.println(c + " alunos possuem média >= 8");
			
		}

}
