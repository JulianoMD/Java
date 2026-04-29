package Poo_aula13_04.terminate_thread;

public class Runner implements Runnable {
    public Runner(Race race, String runner){
        super();
        this.race = race;
        this.runner = runner;
    }

    public Race race;
    public String runner;

    @Override
    public void run() {
        System.out.println(runner + " running...");
        // System.out.println("Winner: " + runner);
        // Checar se algum corredor encerrou a corrida, se não, o corredor atual é o vencedor
        while (!race.isFinished()) {
            race.setFinished(true);
            System.out.println("Winner: " + runner);
            return;
        }
        System.out.println(runner + " lost :(");
    }
}
