package jogo_threads;

public class Corredor implements Runnable {
    private String nome;
    private int distancia = 0;
    private static final int META = 50;

    public Corredor(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome + " avançou para a posição " + i);

            try {
                Thread.sleep((int)(Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nome + " terminou a corrida!");
    }
}
