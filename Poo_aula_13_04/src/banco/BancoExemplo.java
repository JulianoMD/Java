package banco;

public class BancoExemplo {
    public static void main(String[] args) {
        ContaTask conta = new ContaTask();

        // marido e esposa tentando usar a mesma conta
        Thread t1 = new Thread(conta, "Marido");
        Thread t2 = new Thread(conta, "Esposa");

        t1.start();
        t2.start();
    }
}