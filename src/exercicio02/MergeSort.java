package exercicio02;


public class MergeSort {
	public static void main(String[] args) {
		int vet[] = new int[] {26, 69, 25, 53, 59, 27, 41, 0, 33, 16, 35, 43};
		String resultado = "";
		
		System.out.println("Vetor antes do mergeSort: ");
		for(int i : vet) {
			resultado = resultado + "|" + i; 
		}
		System.out.println(resultado);
		
		//Chamada do mergeSort
		mergeSort(vet, 0, vet.length-1);
		
		
		resultado="";
		System.out.println("\n" + "Vetor após mergeSort: ");
		for(int i : vet) {
			resultado = resultado + "|" + i; 
		}
		System.out.println(resultado);
		
	}

	private static void mergeSort(int[] vet, int i, int j) {
		if(i<j) {
			int meio = (i+j)/2;
			//Chamada recursiva para ambas as metades do vetor até que não seja mais possível dividí-las
			mergeSort(vet, i, meio);
			mergeSort(vet, meio+1, j);
			
			//Chamada do método que irá realizar a etapa de Conquista por intercalação
			merge(vet, i, meio, meio+1, j);
		}
		
	}

	private static void merge(int[] vet, int iInicio, int iFim, int jInicio, int jFim) {
		int i = iInicio;
		int i2 = jInicio;
		int iaux = i;
		int aux[] = new int[vet.length];
		
		while(i <= iFim && i2<= jFim) {
			if(vet[i] <= vet[i2]) {
				aux[iaux++] = vet[i++];
			} else {
				aux[iaux++] = vet[i2++];
			}
		}
		
		while(i <= iFim) {
			aux[iaux++] = vet[i++];
		}
		
		while(i2 <= jFim) {
			aux[iaux++] = vet[i2++];
		}
		
		for(int j = iInicio; j<=jFim; j++) {
			vet[j] = aux[j];
		}
		
		
		
	}	
	

}
