package ordenamento;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor =  new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        System.out.println("Vetor desordenado");
        for (int i = 0; i < vetor.length; i++) System.out.print(vetor[i] + " ");

        for (int i = 0; i < vetor.length - 1; i++) {
            int posicaoMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[posicaoMenor];
            vetor[posicaoMenor] = aux;
        }

        System.out.println("\nVetor ordenado");
        for (int i = 0; i < vetor.length; i++) System.out.print(vetor[i] + " ");
    }
}
