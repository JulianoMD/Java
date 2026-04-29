package aula05;

public class Main {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco("Jorge", 1234);
        cliente1.abrirConta("cp");
        cliente1.depositar(500);
        cliente1.sacar(500);
        cliente1.pagarMensalidade();
        System.out.println(cliente1.getSaldo());
        cliente1.sacar(130);
        cliente1.fecharConta();
    }
}