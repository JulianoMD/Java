package Poo_aula13_04.threads_affecting_eachother;

public class CounterTask implements Runnable{
    private int counter;

    @Override
    public void run() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ";" + counter);
        }
    }
}
