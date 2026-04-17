package arvore_binaria;

public class Arvore <TIPO extends Comparable<TIPO>> {
        private NoArvore<TIPO> raiz;

        public Arvore() {
            this.raiz = null;
        }

        public void adicionar(TIPO valor) {
            NoArvore<TIPO> novoNo = new NoArvore<TIPO>(valor);
            if (raiz == null) {
                raiz = novoNo;
            } else {
                NoArvore<TIPO> atual = raiz; // compara o valor do novo nó com o valor do nó atual
                while(true){
                    if (novoNo.getValor().compareTo(atual.getValor()) < 0) { // se for menor que o nó atual
                        if (atual.getEsquerda() != null) {
                            atual = atual.getEsquerda();
                        } else {
                            atual.setEsquerda(novoNo);
                            break;
                        }
                    } else { // se for maior ou igual que o nó atual
                        if (atual.getDireita() != null) {
                            atual = atual.getDireita();
                        } else {
                            atual.setDireita(novoNo);
                            break;
                        }
                    }
                }
            }
        }

    public NoArvore<TIPO> getRaiz() {
        return raiz;
    }

    public void emOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda()); // chama a função recursivamente para o nó da esquerda
            System.out.println(atual.getValor()); // imprime o valor do nó atual
            emOrdem(atual.getDireita()); // chama a função recursivamente para o nó da direita
        }
    }

    public void preOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            System.out.println(atual.getValor()); // imprime o valor do nó atual
            preOrdem(atual.getEsquerda()); // chama a função recursivamente para o nó da esquerda
            preOrdem(atual.getDireita()); // chama a função recursivamente para o nó da direita
        }
    }

    public void posOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda()); // chama a função recursivamente para o nó da esquerda
            posOrdem(atual.getDireita()); // chama a função recursivamente para o nó da direita
            System.out.println(atual.getValor()); // imprime o valor do nó atual
        }
    }

}
