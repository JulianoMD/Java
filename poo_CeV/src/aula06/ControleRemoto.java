package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            System.out.println("------Menu------");
            System.out.println("Esta ligado? " + isLigado());
            System.out.println("Esta tocando? " + isTocando());
            System.out.print("Esta tocando? " + getVolume());
            for (int i = 0; i <= getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
            return;
        }
        System.out.println("Impossivel abrir Menu...");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()){
            setVolume(getVolume() + 5);
            return;
        }
        System.out.println("Impossivel aumentar volume...");
    }

    @Override
    public void menosVolume() {
        if (isLigado()){
            setVolume(getVolume() - 5);
            return;
        }
        System.out.println("Impossivel diminuir volume...");
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0){
            setVolume(0);
            return;
        }
        System.out.println("Impossivel ligar mudo...");
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0){
            setVolume(50);
            return;
        }
        System.out.println("Impossivel desligar mudo...");
    }

    @Override
    public void play() {
        if (isLigado() && !(isTocando()))
            setTocando(true);
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando())
            setTocando(false);
    }
}