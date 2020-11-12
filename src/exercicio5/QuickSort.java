package exercicio5;

public class QuickSort {
	
	public static void main(String[] args) {
		int vet[] = new int[] {149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105, 99};
		int vetfinal[] = new int[vet.length-1];
	/*   ___________________________________________________________________________________________________________________________
		|	 A solução foi criar um segundo vetor com uma posição a menos em relação ao primeiro, retirando o último elemento 99    |
		|	que está sendo utilizado na última posição do primeiro vetor como pivo. 											    |
		|___________________________________________________________________________________________________________________________|	
	 																																	*/
		mostraVetor(vet);

		quickSort(vet, 0, vet.length-1);
		
		retiraPivoDoVetor(vet, vetfinal);

		mostraVetor(vetfinal);
		
	}
	//	-------------------------------------------------------------------------
	public static void quickSort(int vet[], int l, int r) {
		int p;
		if (l<r) {
			p = particao(vet, l, r);
			quickSort(vet, l, p-1);
			quickSort(vet, p+1, r);
		}		
	}
	
//	-------------------------------------------------------------------------
	private static int particao(int[] vet, int l, int r) {
		int pivo = vet[r];
		int aux;
		int i = l-1;
		for (int j = l; j<r; j++) {
			if(vet[j]<pivo) {
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
//	---------------------------------------------------------------------------
	
	private static void retiraPivoDoVetor(int[] vet, int[] vetfinal) {
		int j = 0;
		for(int i : vet) {
			if (i != 99) {
				vetfinal[j] = i;
				j++;
			}
		}
	}
	
//	----------------------------------------------------------------------------
	private static void mostraVetor(int[] vet) {
		String resultado = "";
		System.out.println("Vetor pré-quickSort");
		for(int i = 0; i<vet.length-1; i++) {
		resultado = resultado + vet[i] + "|";
		}
		System.out.println(resultado + "\n");
	}
}
