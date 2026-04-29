package aula16_03;

public abstract class Funcionario {

    private int funcional;
    private String nome;
    private String end;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(int funcional, String nome, String end, double salarioBase) {
        this.funcional = funcional;
        this.nome = nome;
        this.end = end;
        this.salarioBase = salarioBase;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getFuncional() {
        return funcional;
    }

    public String getNome() {
        return nome;
    }

    public String getEnd() {
        return end;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

}