package aula11;

public class Tecnico extends Pessoa{
    private String registroProfissional;

    public void praticar(){
        System.out.println("Aluno" + this.getNome() + " está praticando...");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) { this.registroProfissional = registroProfissional; }
}
