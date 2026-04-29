package Poo_aula13_04.banco;

public class ContaTask implements Runnable {
    private int saldo = 100; // dinheiro compartilhado

    @Override
    public void run() {
        efetuarSaque(70);
    }

    // o 'synchronized' garante apenas uma thread por vez
    private synchronized void efetuarSaque(int valor) {
        String nomeThread = Thread.currentThread().getName();

        if (saldo >= valor) {
            System.out.println(nomeThread + " está indo sacar...");

            // simulando um pequeno atraso no processamento
            try { 
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("A thread " + nomeThread + " foi interrompida.");
            }

            saldo -= valor;
            System.out.println(nomeThread + " completou o saque! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para " + nomeThread + ". Saldo: " + saldo);
        }
    }
}