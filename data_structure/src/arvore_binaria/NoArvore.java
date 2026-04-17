package arvore_binaria;

public class NoArvore<TIPO> {
    private TIPO valor;
    private NoArvore<TIPO> esquerda;
    private NoArvore<TIPO> direita;

    public NoArvore(TIPO novoValor){
        this.valor = novoValor;
        this.direita = null;
        this.esquerda = null;
    }

    public NoArvore(TIPO novoValor, NoArvore<TIPO> direita){
        this.valor = novoValor;
        this.direita = direita;
        this.esquerda = null;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public NoArvore<TIPO> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvore<TIPO> esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvore<TIPO> getDireita() {
        return direita;
    }

    public void setDireita(NoArvore<TIPO> direita) {
        this.direita = direita;
    }
}