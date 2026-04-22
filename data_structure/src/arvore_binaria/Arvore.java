package arvore_binaria;

public class Arvore<TIPO extends Comparable<TIPO>> {

    private NoArvore<TIPO> raiz;

    public Arvore(){
        this.raiz = null;
    }

    public void adicionar(TIPO valor){
        NoArvore<TIPO> novoNoArvore = new NoArvore<TIPO>(valor);
        if (raiz == null){
            this.raiz = novoNoArvore;
        }else{
            NoArvore<TIPO> atual = this.raiz;
            while(true){
                if (novoNoArvore.getValor().compareTo(atual.getValor()) < 0){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoNoArvore);
                        break;
                    }
                }else{ //se for maior ou igual
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoNoArvore);
                        break;
                    }
                }
            }
        }
    }

    public NoArvore<TIPO> getRaiz() {
        return raiz;
    }

    public void emOrdem(NoArvore<TIPO> atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(NoArvore<TIPO> atual){
        if (atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(NoArvore<TIPO> atual){
        if (atual != null){
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

   public boolean remover(TIPO valor) {

        NoArvore<TIPO> atual = this.raiz;
        NoArvore<TIPO> paiAtual = null;

        // busca o node a ser removido e seu pai
        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                break;
            }
            paiAtual = atual;
            if (valor.compareTo(atual.getValor()) < 0) {
                atual = atual.getEsquerda();
            } else {
                atual = atual.getDireita();
            }
        }

        // verifica se o node existe
        if (atual == null) {
            return false;
        }

        // caso 1: node com 2 filhos (ou pelo menos o da direita) ---
        if (atual.getDireita() != null) {
            NoArvore<TIPO> substituto = atual.getDireita();
            NoArvore<TIPO> paiSubstituto = atual;

            // busca o menor na esquerda da sub arvore direita
            while (substituto.getEsquerda() != null) {
                paiSubstituto = substituto;
                substituto = substituto.getEsquerda();
            }

            // Se o substituto veio de longe, reorganiza as mãos
            if (paiSubstituto != atual) {
                // O pai do substituto adota os netos = filhos da direita do substituto
                paiSubstituto.setEsquerda(substituto.getDireita());
                // O substituto assume o controle de toda a ala direita do atual
                substituto.setDireita(atual.getDireita());
            }

            // o substituto assume o node a esquerda do atual
            substituto.setEsquerda(atual.getEsquerda());

            // conecta o substituto ao pai do node removido (ou vira a nova raiz)
            if (paiAtual != null) {
                if (paiAtual.getEsquerda() == atual) {
                    paiAtual.setEsquerda(substituto);
                } else {
                    paiAtual.setDireita(substituto);
                }
            } else {
                this.raiz = substituto;
            }

        // node com apenas filho a esquerda
        } else if (atual.getEsquerda() != null) {
            NoArvore<TIPO> substituto = atual.getEsquerda();
            if (paiAtual != null) {
                if (paiAtual.getEsquerda() == atual) {
                    paiAtual.setEsquerda(substituto);
                } else {
                    paiAtual.setDireita(substituto);
                }
            } else {
                this.raiz = substituto;
            }

        // node folha = sem filhos apenas remocao
        } else {
            if (paiAtual != null) {
                if (paiAtual.getEsquerda() == atual) {
                    paiAtual.setEsquerda(null);
                } else {
                    paiAtual.setDireita(null);
                }
            } else {
                this.raiz = null;
            }
        }

        return true;
    }
}