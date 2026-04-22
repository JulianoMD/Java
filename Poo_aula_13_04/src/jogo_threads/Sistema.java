package jogo_threads;

public class Sistema {

    public static void main(String[] args) {
        for (int simulacao = 1; simulacao <= 5; simulacao++) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("SIMULAÇÃO " + simulacao);
            System.out.println("=".repeat(60) + "\n");

            executarCorrida();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void executarCorrida() {
        // nome personagem mario kart
        String[] nomes = {
            "Mario", "Luigi", "Yoshi", "Peach",
            "Toad", "Bowser", "Wario", "Waluigi",
            "Donkey Kong", "Rosalina"
        };

        Thread[] corredores = new Thread[10];

        for (int i = 0; i < 10; i++) {
            corredores[i] = new Thread(new Corredor(nomes[i]));
            corredores[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                corredores[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n Corrida finalizada! \n");
    }
}