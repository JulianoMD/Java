package aula04;

public class Aula04 {
    public static void main(String[] args){

        Caneta c1 = new Caneta("BIC Azul", "Azul", 0.5f);
        c1.status();
        Caneta c2 = new Caneta("BIC Vermelha", "Vermelha", 0.7f);
        c2.setTampada(false);
        c2.status();


    }
}
