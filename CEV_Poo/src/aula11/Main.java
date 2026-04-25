package aula11;

public class Main {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); a classe Pessoa é abstrata, não pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("Joao");
        v1.setIdade(25);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setMatricula(12345);
        a1.setCurso("Engenharia");
        a1.setIdade(25);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setMatricula(54321);
        b1.setCurso("Medicina");
        b1.setBolsa(50.0f);
        b1.setIdade(22);
        b1.setSexo("Feminino");
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Dr. Smith");
        p1.setIdade(45);
        p1.setSexo("Masculino");
        p1.setEspecialidade("Matemática");
        p1.setSalario(5000.0f);
        p1.receberAumento(500.0f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Carlos");
        t1.setIdade(30);
        t1.setSexo("Masculino");
        t1.setRegistroProfissional("123456");
        t1.praticar();
    }
}
