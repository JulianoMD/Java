package aula16_03;

public class Vendedor extends Funcionario implements 
CalculoSalario, CalculoIR, CalculoFGTS, CalculoINSS {

    public Vendedor() {
    }

    public Vendedor(int funcional, String nome, String end, double salarioBase) {
        super(funcional, nome, end, salarioBase);
    }

    @Override
    public double calcularSalario(double valorVendas) {
        return getSalarioBase() + (valorVendas * 0.04);
    }

    @Override
    public double calcularIR(double salarioBruto) {

        if (salarioBruto <= 2000)
            return 0;

        if (salarioBruto <= 5000)
            return salarioBruto * 0.20;

        return salarioBruto * 0.30;
    }

    @Override
    public double calcularFGTS(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    @Override
    public double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.12;
    }

}