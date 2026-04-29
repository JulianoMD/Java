package aula09;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];
        pessoa[0] = new Pessoa("João", 30, "Masculino");
        pessoa[1] = new Pessoa("Maria", 25, "Feminino");

        livro[0] = new Livro("Harry Potter", "J.K. Rowling", 400, pessoa[0]);
        livro[1] = new Livro("1984", "George Orwell", 350, pessoa[1]);
        livro[2] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkein", 500, pessoa[0]);

        System.out.println(livro[0].detalhes());
        System.out.println(livro[1].detalhes());
        System.out.println(livro[2].detalhes());

    }
}
