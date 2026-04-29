package Poo_aula13_04.creating_tasks;

public class PrintHelloTask implements Runnable {
    private String name;

    public PrintHelloTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            System.out.println(name + "was interrupted");
            e.printStackTrace();
        }
        System.out.println("Hello " + name + "!");
    }
}