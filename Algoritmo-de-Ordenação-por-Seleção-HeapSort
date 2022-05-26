#include <iostream>

using namespace std;

void heapify(int vetor[], int n, int i){
	int largest = i;
	int l = 2*i+1;
	//filho esquerdo(i) = 2i+1
	int r = 2*i+2;
	//filho esquerdo(i) = 2i+2
	
	//verifica se o filho à esquerda é maior que a raiz
	if (l < n && vetor[l] > vetor[largest]) largest = l;
	
	//verifica se o filho à direita é maior que o maior até agora
	if (r < n && vetor[r] > vetor [largest]) largest = r;
	
	//se o maior não está na raiz
	if (largest != i) {
		swap(vetor[i], vetor[largest]);
		//swap em linguagem c serve para receber e trocar o valor de dois inteiros
		
	//empilhar (heapify) recursivamente a sub-árvore afetada
		heapify(vetor, n, largest);
	}
}

void heapSort (int vetor[], int n) {
	//construa um heap (rearranja o vetor)
	for (int i = n/2-1; i>=0; i--)
		heapify(vetor, n, i);
		
	//extrair um elemento por vez do heap
	for (int i=n-1; i>=0; i--){
		//mover a raiz atual para o fim
		swap(vetor[0], vetor[i]);
		
		//chamada da função heapify sobre o heap reduzido
		heapify(vetor, i,0);
	}	
}

/*função para escrever o vetor de tamanho n */
void printArray (int vetor[], int n) {
	for (int i = 0; i < n; i++){
		cout << vetor [i] << " ";
	//cout é uma função que incrementa número a cada chamada e retorna o seu valor
	}
	cout << "\n";
}

int main() {
	int vetor[] = {121, 10, 130, 57, 36, 17};
	int n = sizeof(vetor)/sizeof(vetor[0]);
	
	heapSort(vetor, n);
	
	cout << "Sorted array is \n";
	printArray(vetor,n);
}
