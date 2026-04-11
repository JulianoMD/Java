package ordenamento;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int [10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println("Vetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        System.out.println("\nVetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
