package ordenamento;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = i;
            System.out.printf("%d ", vetor[i]);
        }

        for  (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("Vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
