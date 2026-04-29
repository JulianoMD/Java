package aula05;

public class ContaBanco {
    private int numConta;
    private String tipo; // cc = conta-corrente & cp = conta poupança
    private String dono;
    private double saldo;
    private boolean status;

    // Constructor
    public ContaBanco(String dono, int numConta) {
        this.setDono(dono);
        this.setNumConta(numConta);
        this.setStatus(false);
        this.setSaldo(0);
    }



    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }




    public void abrirConta(String tipo){
        this.setTipo(tipo);

        if (this.isStatus()) {
            System.out.println("Você já abriu uma conta do tipo: " + this.getTipo());
            return;
        }
        if (this.getTipo().equalsIgnoreCase("cc")){
            this.setStatus(true);
            System.out.println("Conta de " + this.getDono() + " aberta com sucesso");
            this.setSaldo(50);
            System.out.println("Você recebeu R$50,00 de bônus por abrir uma conta corrente");
            return;
        }
        this.setStatus(true);
        System.out.println("Conta de " + this.getDono() + " aberta com sucesso");
        this.setSaldo(150);
        System.out.println("Você recebeu R$150,00 de bônus por abrir uma conta poupança");
    }

    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada");
            return;
        }else if (this.getSaldo() < 0){
            System.out.println("Conta com débitos pendentes, não é possível fechar conta");
            return;
        }
        System.out.println("Saque o saldo da conta para fechar conta");
    }

    public void depositar(double valor){
        if (!this.isStatus()){
            System.out.println("Não é possível depositar em uma conta fechada");
            return;
        }
        if (valor < 0){
            System.out.println("Valor insuficiente para depositar em conta");
            return;
        }
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Valor depositado com sucesso");
    }

        public void sacar(double valor){
            if (!this.isStatus()){
                System.out.println("Você não pode sacar de uma conta fechada");
                return;
            }
            if (valor > this.getSaldo()){
                System.out.println("Saldo Insuficiente para o saque");
                return;
            }
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        }


    public void pagarMensalidade() {
        if (!this.isStatus()) {
            System.out.println("Você não possui uma conta nesse  banco");
            return;
        }

        int taxa = (this.getTipo().equalsIgnoreCase("cc")) ? 12 : 20; // O ternário decide o valor e guarda na variável 'taxa'

        if (this.getSaldo() < taxa){
            System.out.println("Saldo Insufuciente para o pagamento da mensalidade");
            return;
        }

        this.setSaldo(this.getSaldo() - taxa);
        System.out.println("Mensalidade de R$" + taxa + " debitada.");
    }

    public void transferir(ContaBanco destino, double valor){
        if (!destino.isStatus()){
            System.out.println("A conta de destino está fechada, não é possível realizar a transferência");
            return;
        }
        if (this.getSaldo() < valor){
            System.out.println("Saldo Insuficiente para a transferência");
            return;
        }
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de $" + valor + " para " + destino.getDono() + "realizada com sucesso");
    }

}