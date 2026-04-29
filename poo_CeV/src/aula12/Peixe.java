package aula12;

public class Peixe extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }
    @Override
    public void fazerSom() {
        System.out.println("Peixe nao faz som");
    }
    public void soltaBolha() {
        System.out.println("Soltou uma Bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
