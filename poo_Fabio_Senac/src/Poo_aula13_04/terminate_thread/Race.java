package Poo_aula13_04.terminate_thread;

public class Race {
    private volatile boolean finished = false;
    // private boolean finished = false;

    public boolean isFinished() {
        return finished;
    }
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}