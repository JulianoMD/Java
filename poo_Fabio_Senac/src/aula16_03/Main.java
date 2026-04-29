package aula16_03;

public class Main {

    public static void main(String[] args) {

        Arquiteto arquiteto = new Arquiteto(1,"Lucas","Rua Oscar Freire",4000);

        double salarioBrutoArq = arquiteto.calcularSalario(30000);
        
        double irArq = arquiteto.calcularIR(salarioBrutoArq);
        double fgtsArq = arquiteto.calcularFGTS(salarioBrutoArq);
        double inssArq = arquiteto.calcularINSS(salarioBrutoArq); 

        double salarioLiquidoArq = salarioBrutoArq - irArq - fgtsArq - inssArq;

        System.out.println("Arquiteto");
        System.out.println("Salario Bruto: " + salarioBrutoArq);
        System.out.println("IR: " + irArq);
        System.out.println("FGTS: " + fgtsArq);
        System.out.println("INSS: " + inssArq);
        System.out.println("Salario Liquido: " + salarioLiquidoArq);


        System.out.printf("%n-----------------%n");


        Vendedor vendedor = new Vendedor(2,"Mario","Avenida Paulista",1200);

        double salarioBrutoVend = vendedor.calcularSalario(15000);

        double irVend = vendedor.calcularIR(salarioBrutoVend);
        double fgtsVend = vendedor.calcularFGTS(salarioBrutoVend);
        double inssVend = vendedor.calcularINSS(salarioBrutoVend);

        double salarioLiquidoVend = salarioBrutoVend - irVend - fgtsVend - inssVend;

        System.out.println("VENDEDOR");
        System.out.println("Salario Bruto: " + salarioBrutoVend);
        System.out.println("IR: " + irVend);
        System.out.println("FGTS: " + fgtsVend);
        System.out.println("INSS: " + inssVend);
        System.out.println("Salario Liquido: " + salarioLiquidoVend);

    }

}