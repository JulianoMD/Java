package aula13;

public class Main {
    static void main(String[] args) {
        Mamifero mamifero =  new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        mamifero.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();

        System.out.println("-".repeat(50));

        cachorro.reagir("ola");
        cachorro.reagir("vai apanhar");
        cachorro.reagir(11);
        cachorro.reagir(21);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2,12f);
        cachorro.reagir(17,4.5f);

    }
}
