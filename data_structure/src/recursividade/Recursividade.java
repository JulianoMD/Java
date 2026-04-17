package recursividade;

public class Recursividade {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for  (int i = 0; i < vetor.length; i++) vetor[i] = (int) (Math.random() * 10);

        System.out.println("Vetor");
        for (int i = 0; i < vetor.length; i++) System.out.print(vetor[i] + " ");

        System.out.println("\nSoma");
        System.out.println(somar(0, 0, vetor));
        
        int somaIterativa = 0;
        for (int i = 0; i < vetor.length; i++){
            somaIterativa += vetor[i];
        }
        System.out.println("Soma Iterativa:\n" + somaIterativa);
    }

    public static int somar(int soma, int posicao, int[] vetor) {
        if (posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma,posicao + 1, vetor);
        }
        return soma;
    }
}
