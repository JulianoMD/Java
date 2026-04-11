package algoritmo_busca;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual numero voce busca?");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        boolean achou = false;
        for (int i = 0; i < vetor.length; i++){
            if (buscado == vetor[i]){
                achou = true;
                break;
            }
        }
        System.out.println(achou ? "Numero encontrado" : "Numero não encontrado");
    }
}