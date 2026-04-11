package algoritmo_busca;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args){
        int[] vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
            // System.out.println(vetor[i]);
        }

        System.out.println("Qual numero voce busca?");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim){
            meio = (int) (inicio + fim) / 2;
            contador++; // contar quantos testes a busca fez
            if (buscado == vetor[meio]){
                achou = true;
                break;
            } else if (buscado < vetor[meio]){
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        System.out.println("Quantidade de testes: " + contador);
        System.out.println(achou ? "Achou" : "Não achou");
        sc.close();
    }
}
